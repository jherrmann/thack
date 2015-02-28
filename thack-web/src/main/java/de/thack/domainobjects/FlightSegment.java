package de.thack.domainobjects;

import org.joda.time.DateTime;

public class FlightSegment {
	
	private String depatureAirport;
	private String arrivalAirport;
	private DateTime departureDateTime;
	private DateTime arrivalDateTime;
	
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
	

}
