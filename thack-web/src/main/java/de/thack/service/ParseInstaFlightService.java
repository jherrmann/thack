package de.thack.service;

import java.io.IOException;
import java.util.Iterator;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.joda.time.DateTime;

import de.thack.domainobjects.Flight;
import de.thack.domainobjects.FlightSegment;

public class ParseInstaFlightService {

	public static Flight parseInstaFlight(String json)
			throws JsonProcessingException, IOException {
		ObjectMapper mapper = new ObjectMapper();

		JsonNode readTree = mapper.readTree(json);
		JsonNode path = readTree.path("PricedItineraries");
		for (Iterator<JsonNode> iterator = path.getElements(); iterator
				.hasNext();) {
			JsonNode currenetNode = iterator.next();

			JsonNode segmentNodes = currenetNode.path("AirItinerary")
					.path("OriginDestinationOptions")
					.path("OriginDestinationOption").getElements().next()
					.path("FlightSegment");

			for (JsonNode segmentNode : segmentNodes) {

				// System.out.println(mapper.defaultPrettyPrintingWriter().writeValueAsString(segmentNode));
				FlightSegment segment = new FlightSegment();

				segment.setFlightNumber(segmentNode.path("FlightNumber")
						.getIntValue());
				segment.setDepatureAirport(segmentNode.path("DepartureAirport")
						.path("LocationCode").getTextValue());
				segment.setDepartureDateTime(DateTime.parse(segmentNode.path(
						"DepartureDateTime").getTextValue()));

				segment.setArrivalAirport(segmentNode.path("ArrivalAirport")
						.path("LocationCode").getTextValue());
				segment.setArrivalDateTime(DateTime.parse(segmentNode.path(
						"ArrivalDateTime").getTextValue()));
				System.out.println("--" + segment.toString());

			}

		}
		return null;
	}

}
