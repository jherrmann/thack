package de.thack.api.sabre.model;

import java.util.LinkedList;
import java.util.List;

import org.joda.time.DateTime;

public class Flight {

	private List<FlightSegment> routingTo = new LinkedList<FlightSegment>();
	private List<FlightSegment> routingReturn = new LinkedList<FlightSegment>();
	private double price;
	private String currency;

	public DateTime getTopLandingTime() {
		return routingTo.get(0).getDepartureDateTime();
	}

	public DateTime getEndJourneyLandingTime() {
		return routingTo.get(0).getArrivalDateTime();
	}

	public void addSegmentTo(FlightSegment segment) {
		routingTo.add(segment);
	}

	public void addSegmentReturn(FlightSegment segment) {
		routingReturn.add(segment);
	}

	public List<FlightSegment> getRoutingTo() {
		return routingTo;
	}

	public void setRoutingTo(List<FlightSegment> routingTo) {
		this.routingTo = routingTo;
	}

	public List<FlightSegment> getRoutingReturn() {
		return routingReturn;
	}

	public void setRoutingReturn(List<FlightSegment> routingReturn) {
		this.routingReturn = routingReturn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public void printOut() {
		System.out.println(String.valueOf(price) + " " + currency);
		for (FlightSegment flightSegment : routingTo) {
			System.out.println(flightSegment.toString());
		}
		for (FlightSegment flightSegment : routingReturn) {
			System.out.println(flightSegment.toString());
		}
	}

}
