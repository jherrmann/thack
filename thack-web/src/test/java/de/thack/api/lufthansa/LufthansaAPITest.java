package de.thack.api.lufthansa;

import java.io.IOException;

import org.codehaus.jackson.JsonProcessingException;
import org.junit.Test;

public class LufthansaAPITest {

	@Test
	public void searchFlights() throws JsonProcessingException, IOException {

		// MyClass is tested
		LufthansaAPI lufthansaAPI = new LufthansaAPI();
		String flights = lufthansaAPI.searchFlights("HAM", "DFW", "2015-03-28", 7);

		// Tests
		System.out.println(flights);
//		assertEquals("Should have result", false, tours.getData().getTours().isEmpty());

	}
	
}
