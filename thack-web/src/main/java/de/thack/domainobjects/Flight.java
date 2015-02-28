package de.thack.domainobjects;

import java.util.LinkedList;
import java.util.List;


public class Flight {

	private List<FlightSegment> routing = new LinkedList<FlightSegment>();
	private double price;
	private String currency;
	
	public List<FlightSegment> getRouting() {
		return routing;
	}
	public void setRouting(List<FlightSegment> routing) {
		this.routing = routing;
	}
	public void addLeg(FlightSegment segment) {
		routing.add(segment);
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
		for (FlightSegment flightSegment : routing) {
			System.out.println(flightSegment.toString());
		}
	}
	
}
