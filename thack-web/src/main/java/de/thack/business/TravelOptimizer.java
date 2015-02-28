package de.thack.business;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.codehaus.jackson.JsonProcessingException;
import org.joda.time.format.DateTimeFormat;

import de.thack.api.getyourguide.GetYourGuideAPI;
import de.thack.api.getyourguide.model.Tour;
import de.thack.api.getyourguide.model.TourResponse;
import de.thack.api.sabre.SabreAPI;
import de.thack.api.sabre.model.Destination;
import de.thack.api.sabre.model.Flight;
import de.thack.api.sabre.model.TopDestinationResponse;
import de.thack.model.Itinerary;
import de.thack.model.Travel;

/**
 * @author j2ee
 */
public class TravelOptimizer {

	@Inject
	SabreAPI sabreAPI;
	
	@Inject
	GetYourGuideAPI getYourGuideAPI;

	@Inject
	Logger log;

	public Travel optimizer(Travel travel) throws JsonProcessingException,
			IOException {
		// find default flight
		List<Flight> foundFlights = sabreAPI.searchFlights(travel
				.getStartPlace(), travel.getStopPlace(), travel.getStartTime()
				.toString(DateTimeFormat.forPattern("YYYY-MM-dd")),
				travel.getStartTime().plusDays(travel.getDurationAtAll())
						.toString(DateTimeFormat.forPattern("YYYY-MM-dd")));
		if (foundFlights != null) {
			for (Flight flight : foundFlights) {
				flight.printOut();
			}
		}

		// find top destinations
		TopDestinationResponse topDestination = sabreAPI
				.findTopDestination(travel.getStartPlace());
		List<Destination> destinations = topDestination.getDestinations();
		// get top 5 Targets
		int i = 0;
		for (Destination destination : destinations) {
			if (i == 5) {
				break;
			}

			Itinerary itinerary = new Itinerary();
			
			String destinationLocationTop = destination.getDestination().getDestinationLocation();
			itinerary.setTopDestination(destinationLocationTop);

			System.out.println("Top Dest " + i + " "
					+ destinationLocationTop);
			// find flights from origin to top 5
			List<Flight> fromOriginToTopFlights = sabreAPI.searchFlights(
					travel.getStartPlace(),
					destinationLocationTop,
					travel.getStartTime()
							.plusDays(
									travel.getDurationAtAll()
											- travel.getDurationAtStop())
							.toString(DateTimeFormat.forPattern("YYYY-MM-dd")),
					travel.getStartTime().plusDays(travel.getDurationAtAll())
							.toString(DateTimeFormat.forPattern("YYYY-MM-dd")));
			if (fromOriginToTopFlights != null) {
				for (Flight flight : fromOriginToTopFlights) {
					// flight.printOut();
					itinerary.setFromOriginToTop(flight);
				}
			}

			// // find flights from top 5 to destination
			List<Flight> fromTopToDestinationFlights = sabreAPI.searchFlights(
					destinationLocationTop,
					travel.getStopPlace(),
					travel.getStartTime()
							.plusDays(
									travel.getDurationAtAll()
											- travel.getDurationAtStop())
							.toString(DateTimeFormat.forPattern("YYYY-MM-dd")),
					travel.getStartTime().plusDays(travel.getDurationAtAll())
							.toString(DateTimeFormat.forPattern("YYYY-MM-dd")));
			if (fromTopToDestinationFlights != null) {
				for (Flight flight : fromTopToDestinationFlights) {
					// flight.printOut();
					itinerary.setFromTopToDestination(flight);
				}
			}
			i++;

			if (itinerary.getFromOriginToTop() != null
					&& itinerary.getFromTopToDestination() != null) {
				travel.addItinerary(itinerary);
				
				// find top attractions at topDestination
				if(itinerary.getTopDestination().equals("WAS") || itinerary.getTopDestination().equals("NYC")) {
					String topDestinationLongName = null;
					if(itinerary.getTopDestination().equals("WAS")) {
						topDestinationLongName = "Washington";
					} else if(itinerary.getTopDestination().equals("NYC")) {
						topDestinationLongName = "New York";
					}
					
					TourResponse tourResponse = getYourGuideAPI.searchTours(topDestinationLongName, travel.getStartTime().toString(DateTimeFormat.forPattern("YYYY-MM-dd")));
					List<Tour> tours = tourResponse.getData().getTours();
					// add Tours to Itinerary as long as budget last but no more then 3
					int nrTours = 0;
					for (Tour tour : tours) {
						if(nrTours >= 3)
							break;
						if(itinerary.getTotalPrice() + Double.valueOf(tour.getPrice().getValues().getAmount().toString()) < travel.getBudget()){
							itinerary.addTour(tour);
							log.info("added tour "+tour.getTitle() + " Price: "+ tour.getPrice().getValues().getAmount().toString());
						}
					}
					
				} else {
					log.info("top Destination LogName '"+topDestination+"'not Found !!!!!!!!!!!!!!!!");
				}
				
			}
		}
		

		Collections.sort(travel.getItineraries(), new Itinerary());
		
		return travel;
	}

}
