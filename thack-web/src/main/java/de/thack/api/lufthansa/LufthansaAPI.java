package de.thack.api.lufthansa;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.codehaus.jackson.JsonProcessingException;

public class LufthansaAPI {

	private static String USERNAME = "LufthansaTest";
	private static String PASSWORD = "4ff3b9ec51498f3a12250821fe9f2b6eb2dc1d8e";
	
	public String searchFlights(String from, String to, String date, int days) throws JsonProcessingException, IOException {
		String urlString = "http://lh-fs-json.production.vayant.com/";
		URL url = new URL(urlString);
		
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-type", "application/json");
		conn.setRequestProperty("User", USERNAME);
		conn.setRequestProperty("Pass", PASSWORD);
		conn.setRequestProperty("Environment", "lh-vzg");
		conn.setRequestProperty("Origin", from);
		conn.setRequestProperty("Destination", to);
		conn.setRequestProperty("DepartureFrom", date);
		conn.setRequestProperty("LengthOfStay", Integer.toString(days));
		
		/// ---------------
		conn.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
		wr.writeBytes("");
		wr.flush();
		wr.close();
 
		int responseCode = conn.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
//		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);
 
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(conn.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		// ----------------
		
		
//		if (conn.getResponseCode() != 200) {
//			throw new RuntimeException("Failed : HTTP error code : "
//					+ conn.getResponseCode() + conn.getResponseMessage());
//		}
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(
//				(conn.getInputStream())));
//
//		String output;
//		System.out.println("Output from Server .... \n");
//		output = br.readLine();
//
//		// prase output
////		TourResponse response = GetYourGuideService.parseTours(output);
//		String response = output;
//		
//		// parse output end
//
		conn.disconnect();
		
		return "";
	}
	
}
