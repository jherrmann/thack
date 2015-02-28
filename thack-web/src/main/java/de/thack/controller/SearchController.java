package de.thack.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Logger;

import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.codehaus.jackson.JsonProcessingException;

import de.thack.business.TravelOptimizer;
import de.thack.model.Itinerary;
import de.thack.model.Travel;

@Named
@ConversationScoped
public class SearchController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private FacesContext facesContext;

	@Inject
	private TravelOptimizer travelOptimizer;

	@Inject
	private Logger logger;

	@Inject
	private Conversation conversation;

	@Named
	@Produces
	@ConversationScoped 
	private Travel travel = new Travel();

	public String search() throws JsonProcessingException, IOException {
		beginConversation();
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
		return "success";
	}

	public Travel getTravel() {
		return travel;
	}

	public void setTravel(Travel travel) {
		this.travel = travel;
	}

	private void beginConversation() {
		if (conversation.isTransient()) {
			conversation.begin();

			return;
		}
	}

	private void endConversation() {
		if (!conversation.isTransient()) {
			conversation.end();

			return;
		}
	}

}
