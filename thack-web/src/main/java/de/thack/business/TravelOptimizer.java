package de.thack.business;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.codehaus.jackson.JsonProcessingException;
import org.joda.time.format.DateTimeFormat;

import de.thack.api.sabre.SabreAPI;
import de.thack.api.sabre.model.Destination;
import de.thack.api.sabre.model.Flight;
import de.thack.api.sabre.model.TopDestinationResponse;
import de.thack.model.Travel;

/**
 * @author j2ee
 */
public class TravelOptimizer {

	@Inject
	SabreAPI sabreAPI;

	@Inject
	Logger log;
	
	public void optimizer(Travel travel) throws JsonProcessingException,
			IOException {
		// find default flight
		List<Flight> foundFlights = sabreAPI.searchFlights(travel
				.getStartPlace(), travel.getStopPlace(), travel.getStartTime()
				.toString(DateTimeFormat.forPattern("YYYY-MM-dd")), travel.getStartTime().plusDays(travel.getDurationAtAll())
				.toString(DateTimeFormat.forPattern("YYYY-MM-dd")));
		
		for (Flight flight : foundFlights) {
			flight.printOut();
		}
		
		// find top destinations
		TopDestinationResponse topDestination = sabreAPI.findTopDestination(travel.getStartPlace());
		List<Destination> destinations = topDestination.getDestinations();
		// get top 5 Targets
		int i = 0;
		for (Destination destination : destinations) {
			if(i==5) {
				break;
			}
			System.out.println("Top Dest "+i+" "+destination.getDestination().getDestinationLocation());
//			// find flights to top 5
			List<Flight> foundTopFlights = sabreAPI.searchFlights(
					destination.getDestination().getDestinationLocation(),
					travel.getStopPlace(),
					travel.getStartTime()
							.plusDays(
									travel.getDurationAtAll()
											- travel.getDurationAtStop())
							.toString(DateTimeFormat.forPattern("YYYY-MM-dd")),
					travel.getStartTime().plusDays(travel.getDurationAtAll())
							.toString(DateTimeFormat.forPattern("YYYY-MM-dd")));
			for (Flight flight : foundTopFlights) {
				flight.printOut();
			}
			i++;
		}
		

	}

}
