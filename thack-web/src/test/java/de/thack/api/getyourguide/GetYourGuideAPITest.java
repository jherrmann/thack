package de.thack.api.getyourguide;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.codehaus.jackson.JsonProcessingException;
import org.junit.Test;

import de.thack.api.getyourguide.model.TourResponse;

public class GetYourGuideAPITest {

	@Test
	public void searchTours() throws JsonProcessingException, IOException {

		// MyClass is tested
		GetYourGuideAPI getYourGuideAPI = new GetYourGuideAPI();

		TourResponse tours = getYourGuideAPI.searchTours("New%20York", "2015-03-12T00:00:00");

		// Tests
		assertEquals("Should have result", false, tours.getData().getTours().isEmpty());
		tours.printOut();
	}
	
	@Test
	public void searchTourswithoutDate() throws JsonProcessingException, IOException {

		// MyClass is tested
		GetYourGuideAPI getYourGuideAPI = new GetYourGuideAPI();
		TourResponse tours = getYourGuideAPI.searchTours("Washington, DC", "2015-03-12T00:00:00");

		// Tests
		assertEquals("Should have result", false, tours.getData().getTours().isEmpty());
		tours.printOut();
	}	
	
}
