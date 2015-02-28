package de.thack.service;

import java.io.IOException;
import java.util.Iterator;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.joda.time.DateTime;

import de.thack.api.sabre.model.Flight;
import de.thack.api.sabre.model.FlightSegment;

public class ParseInstaFlightService {

	public static Flight parseInstaFlight(String json)
			throws JsonProcessingException, IOException {
		ObjectMapper mapper = new ObjectMapper();

		JsonNode readTree = mapper.readTree(json);
		JsonNode path = readTree.path("PricedItineraries");
		for (Iterator<JsonNode> iterator = path.getElements(); iterator
				.hasNext();) {
			JsonNode itinerary = iterator.next();
			
			Flight flight = new Flight();
			JsonNode totalFare = itinerary.path("AirItineraryPricingInfo")
			.path("PTC_FareBreakdowns")
			.path("PTC_FareBreakdown")
			.path("PassengerFare")
			.path("TotalFare");
			flight.setPrice(Double.valueOf(totalFare.path("Amount").getTextValue()));
			flight.setCurrency(totalFare.path("CurrencyCode").getTextValue());
			
//			PricedItineraries AirItineraryPricingInfo": {
//            "PTC_FareBreakdowns": {
//                "PTC_FareBreakdown": {
//				PassengerFare": {
//				                        "TotalFare": {
//				                            "CurrencyCode": "USD",
//				                            "Amount": "311.20"

			JsonNode segmentNodes = itinerary.path("AirItinerary")
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

				flight.addLeg(segment);
			}
			flight.printOut();
		}
		return null;
	}

}
