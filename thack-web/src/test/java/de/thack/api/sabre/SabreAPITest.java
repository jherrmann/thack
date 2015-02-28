package de.thack.api.sabre;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonProcessingException;
import org.junit.Test;

import de.thack.api.sabre.model.Flight;
import de.thack.api.sabre.model.TopDestinationResponse;

public class SabreAPITest {

	@Test
	public void InstaFlight() throws JsonProcessingException, IOException {

		// MyClass is tested
		SabreAPI sabreAPI = new SabreAPI();
		List<Flight> searchFlights = sabreAPI.searchFlights("MIA", "NYC",
				"2015-03-12", "2015-03-20");

		// Tests
		assertEquals("Should have result", false, searchFlights.isEmpty());
		searchFlights.get(0).printOut();
	}

	@Test
	public void topDestination() throws JsonProcessingException, IOException {

		// MyClass is tested
		SabreAPI sabreAPI = new SabreAPI();
		TopDestinationResponse findTopDestination = sabreAPI
				.findTopDestination("MIA");

		// Tests
		assertEquals("Should have result", false, findTopDestination
				.getDestinations().isEmpty());
	}

}
