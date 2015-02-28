package de.thack.service;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import de.thack.api.getyourguide.model.TourResponse;

public class GetYourGuideService {

	public static TourResponse parseTours(String json) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();

		TourResponse tours = mapper.readValue(json, TourResponse.class);
		
		return tours;
	}	
	
}
