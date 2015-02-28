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

		String test = "{\"age\":29,\"messages\":[\"msg 1\",\"msg 2\",\"msg 3\"],\"name\":\"mkyong\"}";

		User jsonUser = mapper.readValue(test, User.class);
		
		JsonNode readTree = mapper.readTree(test);
		JsonNode path = readTree.path("messages");
		for (Iterator<JsonNode> iterator = path.getElements(); iterator.hasNext();) {
			System.out.println(iterator.next().toString());
			
		}
		
		System.out.println(readTree.get("age"));
		
		System.out.println(jsonUser.getName());
		System.out.println(jsonUser.getMessages().size());
		System.out.println(jsonUser.getMessages().get(1));

		
	}
}
