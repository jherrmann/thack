package de.thack.business;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.codehaus.jackson.JsonProcessingException;
import org.joda.time.format.DateTimeFormat;

import de.thack.api.sabre.SabreAPI;
import de.thack.api.sabre.model.Flight;
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
		List<Flight> foundFlights = sabreAPI.searchFlights(travel
				.getStartPlace(), travel.getStartPlace(), travel.getStartTime()
				.toString(DateTimeFormat.forPattern("YYYY-MM-DD")), travel
				.getStopTime()
				.toString(DateTimeFormat.forPattern("YYYY-MM-DD")));
		
		for (Flight flight : foundFlights) {
			flight.printOut();
		}
		
		

	}

}
