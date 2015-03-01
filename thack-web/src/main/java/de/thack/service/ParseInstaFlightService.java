package de.thack.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.joda.time.DateTime;

import de.thack.api.sabre.model.Flight;
import de.thack.api.sabre.model.FlightSegment;

public class ParseInstaFlightService {

	public static List<Flight> parseInstaFlight(String json, int numberReturn)
			throws JsonProcessingException, IOException {
		ObjectMapper mapper = new ObjectMapper();

		ArrayList<Flight> flights = new ArrayList<>();

		JsonNode readTree = mapper.readTree(json);
		JsonNode path = readTree.path("PricedItineraries");
		int flightCounter = 0;
		for (Iterator<JsonNode> iterator = path.getElements(); iterator
				.hasNext();) {
			JsonNode itinerary = iterator.next();

			if (flightCounter >= numberReturn) {
				break;
			}

			Flight flight = new Flight();
			JsonNode totalFare = itinerary.path("AirItineraryPricingInfo")
					.path("PTC_FareBreakdowns").path("PTC_FareBreakdown")
					.path("PassengerFare").path("TotalFare");
			System.out.println("_____________________________");
			System.out.println(totalFare.path("Amount").getTextValue());
			if (totalFare.path("Amount").isMissingNode() || totalFare.path("Amount").isNull()) {
				continue;
			}
			flight.setPrice(Double.valueOf(totalFare.path("Amount")
					.getTextValue()));
			flight.setCurrency(totalFare.path("CurrencyCode").getTextValue());

			JsonNode originDestinationOption = itinerary.path("AirItinerary")
					.path("OriginDestinationOptions")
					.path("OriginDestinationOption");
			int i = 0;
			for (JsonNode originDestinationOptionNode : originDestinationOption) {

				JsonNode segmentNodes = originDestinationOptionNode
						.path("FlightSegment");

				for (JsonNode segmentNode : segmentNodes) {

					// System.out.println(mapper.defaultPrettyPrintingWriter().writeValueAsString(segmentNode));
					FlightSegment segment = new FlightSegment();

					segment.setFlightNumber(segmentNode.path("FlightNumber")
							.getIntValue());
					segment.setAirlineCode(segmentNode.path("OperatingAirline")
							.path("Code").getTextValue());
					segment.setDepatureAirport(segmentNode
							.path("DepartureAirport").path("LocationCode")
							.getTextValue());
					segment.setDepartureDateTime(DateTime.parse(segmentNode
							.path("DepartureDateTime").getTextValue()));

					segment.setArrivalAirport(segmentNode
							.path("ArrivalAirport").path("LocationCode")
							.getTextValue());
					segment.setArrivalDateTime(DateTime.parse(segmentNode.path(
							"ArrivalDateTime").getTextValue()));
					if (i == 0)
						flight.addSegmentTo(segment);
					else if (i == 1)
						flight.addSegmentReturn(segment);

				}
				// flight.printOut();
				flights.add(flight);
				i++;
			}

			flightCounter++;
		}
		return flights;
	}

}
