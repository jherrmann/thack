package de.thack.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.validator.internal.util.privilegedactions.GetClassLoader;

import de.thack.domainobjects.Flight;
import de.thack.service.ParseInstaFlightService;

public class Main2 {

	public static void main(String[] args) throws Exception {


		ObjectMapper mapper = new ObjectMapper();
		
		InputStream resourceAsStream = Main2.class.getClassLoader().getResourceAsStream("sabre_flights.json");
		JsonNode readTree = mapper.readTree(resourceAsStream);
		
		System.out.println(readTree.size());
		System.out.println(readTree.toString());
		
		
//		String output;
//		System.out.println("Output from Server .... \n");
//		output = br.readLine();
//		while ((output = br.readLine()) != null) {
//			System.out.println(output);
//		}

	}

}
