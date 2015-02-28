package de.thack.controller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.codehaus.jackson.JsonProcessingException;

import de.thack.business.TravelOptimizer;
import de.thack.model.Itinerary;
import de.thack.model.Travel;

@Named
@RequestScoped
public class SearchController {

	@Inject
	private FacesContext facesContext;

	@Inject
	private TravelOptimizer travelOptimizer;

	@Inject
	private Logger logger;

	@Named
	@Produces
	@RequestScoped
	private Travel travel = new Travel();

	public void search() throws JsonProcessingException, IOException {
		logger.info("Wassss uppp");
		logger.info(travel.getStartPlace());
		logger.info(travel.getStartTime().toString());
		logger.info("optimizing the shit out of this stuff");
		Travel optimizedTravel = travelOptimizer.optimizer(travel);

		logger.info(optimizedTravel.getItineraries().size() + "");

		logger.info("-------------------------------------------");
		for (Itinerary itinerary : optimizedTravel.getItineraries()) {
			logger.info(itinerary.getTotalPrice() + " routing "
					+ optimizedTravel.getStartPlace() + " to "
					+ itinerary.getTopDesintion() + " to final "
					+ optimizedTravel.getStopPlace());

			itinerary.getFromOriginToTop().printOut();
			itinerary.getFromTopToDestination().printOut();
		}
		logger.info("-------------------------------------------");

	}

	public Travel getTravel() {
		return travel;
	}

	public void setTravel(Travel travel) {
		this.travel = travel;
	}

}
