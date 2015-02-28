package de.thack.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import de.thack.domainobjects.Flight;
import de.thack.domainobjects.TopDestinationResponse;
import de.thack.service.ParseInstaFlightService;
import de.thack.service.ParseTopDestinationService;

public class Main1 {

	// http://localhost:8080/RESTfulExample/json/product/get
	public static void main(String[] args) {

		try {

			// insta flight search
			URL url = new URL(
					"https://api.test.sabre.com/v1/shop/flights?origin=MIA&destination=LAS&departuredate=2015-03-12&returndate=2015-03-20&includedconnectpoints=DFW&onlineitinerariesonly=N&limit=10&offset=1&eticketsonly=N&sortby=totalfare&order=asc&sortby2=departuretime&order2=asc&pointofsalecountry=US&passengercount=1");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			conn.setRequestProperty("Authorization", "Bearer Shared/IDL:IceSess\\/SessMgr:1\\.0.IDL/Common/!ICESMS\\/ACPCRTD!ICESMSLB\\/CRT.LB!-0123456789012345678!123456!0!ABCDEFGHIJKLM!E2E-1");
			
//			Header:
//				Authorization: Bearer Shared/IDL:IceSess\/SessMgr:1\.0.IDL/Common/!ICESMS\/ACPCRTD!ICESMSLB\/CRT.LB!-0123456789012345678!123456!0!ABCDEFGHIJKLM!E2E-1
//				X-Originating-Ip: 212.121.131.210 

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			output = br.readLine();
//			while ((output = br.readLine()) != null) {
//				System.out.println(output);
//			}

			// prase output
			Flight flight = ParseInstaFlightService.parseInstaFlight(output);
			
			// parse output end

			conn.disconnect();

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}
		
		// top destination search
		try {

			URL url = new URL(
					"https://api.test.sabre.com/v1/lists/top/destinations?origin=MIA&destinationtype=DOMESTIC&theme=NATIONAL-PARKS&topdestinations=50&destinationcountry=US");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			conn.setRequestProperty("Authorization", "Bearer Shared/IDL:IceSess\\/SessMgr:1\\.0.IDL/Common/!ICESMS\\/ACPCRTD!ICESMSLB\\/CRT.LB!-0123456789012345678!123456!0!ABCDEFGHIJKLM!E2E-1");
			
//			Header:
//				Authorization: Bearer Shared/IDL:IceSess\/SessMgr:1\.0.IDL/Common/!ICESMS\/ACPCRTD!ICESMSLB\/CRT.LB!-0123456789012345678!123456!0!ABCDEFGHIJKLM!E2E-1
//				X-Originating-Ip: 212.121.131.210 

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			output = br.readLine();
//			while ((output = br.readLine()) != null) {
//				System.out.println(output);
//			}

			// prase output
			TopDestinationResponse topDestination = ParseTopDestinationService.parseTopDestination(output);
			System.out.println(topDestination.getTheme());
			// parse output end

			conn.disconnect();

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
