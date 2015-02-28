package de.thack.api.sabre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import de.thack.api.sabre.model.Flight;
import de.thack.api.sabre.model.TopDestinationResponse;
import de.thack.service.ParseInstaFlightService;
import de.thack.service.ParseTopDestinationService;

public class SabreAPI {
	
	private static String AUTHORIZATION_VALUE = "Bearer Shared/IDL:IceSess\\/SessMgr:1\\.0.IDL/Common/!ICESMS\\/ACPCRTD!ICESMSLB\\/CRT.LB!-0123456789012345678!123456!0!ABCDEFGHIJKLM!E2E-1";
	
	
	/**
	 * Finds flights via sabres InstaFlight endpoint
	 * 
	 * @return
	 * @throws IOException 
	 * @throws JsonProcessingException 
	 */
	public List<Flight> searchFlights(String from, String to, String startDate, String endDate) throws JsonProcessingException, IOException {
		// insta flight search
		URL url = new URL(
				"https://api.test.sabre.com/v1/shop/flights?origin="+from
				+"&destination="+to
				+"&departuredate="+startDate
				+"&returndate="+endDate
				+"&onlineitinerariesonly=N&limit=10&offset=1&eticketsonly=N&sortby=totalfare&order=asc&sortby2=departuretime&order2=asc&pointofsalecountry=US&passengercount=1");
		
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");
		conn.setRequestProperty("Authorization", AUTHORIZATION_VALUE);
		
		if (conn.getResponseCode() != 200) {
			System.err.println("Failed : HTTP error code : "
					+ conn.getResponseCode() + conn.getResponseMessage());
			return null;
		} 

		BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

		String output;
		System.out.println("Output from Server .... \n");
		output = br.readLine();

//		ObjectMapper mapper = new ObjectMapper();
//		JsonNode readTree = mapper.readTree(output);
////		JsonNode path = readTree.path("PricedItineraries");
//		 System.out.println(mapper.defaultPrettyPrintingWriter().writeValueAsString(readTree));
		
		// prase output
		List<Flight> parseInstaFlight = ParseInstaFlightService.parseInstaFlight(output);
		
		// parse output end

		conn.disconnect();
		
		return parseInstaFlight;
	}

	/**
	 * query the Sabre api for the top destinations from an airport
	 * 
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public TopDestinationResponse findTopDestination(String currentDestination) throws JsonParseException, JsonMappingException, IOException {
		
		URL url = new URL(
				"https://api.test.sabre.com/v1/lists/top/destinations?origin="+currentDestination
				+"&destinationtype=DOMESTIC"+
//						+"&theme=NATIONAL-PARKS"
						"&topdestinations=50&destinationcountry=US");
		
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");
		conn.setRequestProperty("Authorization", AUTHORIZATION_VALUE);
		
		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ conn.getResponseCode());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

		String output;
		System.out.println("Output from Server .... \n");
		output = br.readLine();

//		ObjectMapper mapper = new ObjectMapper();
//		JsonNode readTree = mapper.readTree(output);
//		 System.out.println(mapper.defaultPrettyPrintingWriter().writeValueAsString(readTree));
		
		
		// parse output
		 TopDestinationResponse parseTopDestination = ParseTopDestinationService.parseTopDestination(output);
		
		// parse output end

		conn.disconnect();
		
		return parseTopDestination;
	}
	

}
