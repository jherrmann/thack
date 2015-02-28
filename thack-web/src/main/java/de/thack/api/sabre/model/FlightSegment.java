package de.thack.api.sabre.model;

import org.joda.time.DateTime;

public class FlightSegment {
	
	private String depatureAirport;
	private String arrivalAirport;
	private DateTime departureDateTime;
	private DateTime arrivalDateTime;
	private int flightNumber;
	
	public String getDepatureAirport() {
		return depatureAirport;
	}
	public void setDepatureAirport(String depatureAirport) {
		this.depatureAirport = depatureAirport;
	}
	public String getArrivalAirport() {
		return arrivalAirport;
	}
	public void setArrivalAirport(String arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}
	public DateTime getDepartureDateTime() {
		return departureDateTime;
	}
	public void setDepartureDateTime(DateTime departureDateTime) {
		this.departureDateTime = departureDateTime;
	}
	public DateTime getArrivalDateTime() {
		return arrivalDateTime;
	}
	public void setArrivalDateTime(DateTime arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}
	
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	@Override
	public String toString() {
		return flightNumber +": "+depatureAirport +" "+arrivalAirport +" "+departureDateTime+ "+"+arrivalDateTime;
	}
}
