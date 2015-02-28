package de.thack.service;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import de.thack.api.sabre.model.TopDestinationResponse;

public class ParseTopDestinationService {

	public static TopDestinationResponse parseTopDestination(String json) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();

		TopDestinationResponse destinations = mapper.readValue(json, TopDestinationResponse.class);
		
		
		return destinations;
	}
	
}
