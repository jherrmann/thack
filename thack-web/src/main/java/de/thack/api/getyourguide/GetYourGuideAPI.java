package de.thack.api.getyourguide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.codehaus.jackson.JsonProcessingException;

import de.thack.api.getyourguide.model.TourResponse;
import de.thack.service.GetYourGuideService;

public class GetYourGuideAPI {

	private static String TOKEN = "SjPBGQfb232mz0lLafjuMOaWJmF36PfkzAM0h1ihslwsd17Y";
			
	public TourResponse searchTours(String locationName, String date) throws JsonProcessingException, IOException {
		String urlString = "http://api-getyourguide-com-test3.gygtest.com/1/tours?currency=USD&cnt_language=en&q="+locationName;
		if(date != null && date.length() > 0)
			urlString = urlString + "&date="+date;
		System.out.println(urlString);
		URL url = new URL(urlString);
		
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");
		conn.setRequestProperty("X-ACCESS-TOKEN", TOKEN);
		
		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ conn.getResponseCode() + conn.getResponseMessage());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

		String output;
		System.out.println("Output from Server .... \n");
		output = br.readLine();

		// prase output
		TourResponse response = GetYourGuideService.parseTours(output);
		
		// parse output end

		conn.disconnect();
		
		return response;
	}
	
}
