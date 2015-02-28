package de.thack.test;

import java.io.IOException;
import java.util.Iterator;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JasonMain1 {

	public static void main(String[] args) throws JsonParseException,
			JsonMappingException, IOException {
		User user = new User();
		ObjectMapper mapper = new ObjectMapper();

		String test = "";
		
		
		User jsonUser = mapper.readValue(test, User.class);
		
		System.out.println(jsonUser.getName());
		System.out.println(jsonUser.getMessagesee().size());
		System.out.println(jsonUser.getMessagesee().get(1));

		
	}
}
