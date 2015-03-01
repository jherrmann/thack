package de.thack.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import de.thack.api.sabre.model.Flight;

public class Travel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String startPlace;

	private String stopPlace;

	private DateTime startTime;

	private Integer durationAtStop;

	private Integer durationAtAll;

	private Double budget;

	private List<Itinerary> itineraries = new ArrayList<Itinerary>();

	private Flight defaultFlight;

	public Flight getDefaultFlight() {
		return defaultFlight;
	}

	public void setDefaultFlight(Flight defaultFlight) {
		this.defaultFlight = defaultFlight;
	}

	public List<Itinerary> getItineraries() {
		return itineraries;
	}

	public void setItineraries(List<Itinerary> itineraries) {
		this.itineraries = itineraries;
	}

	public String getStartPlace() {
		return startPlace;
	}

	public void setStartPlace(String startPlace) {
		this.startPlace = startPlace;
	}

	public String getStopPlace() {
		return stopPlace;
	}

	public void setStopPlace(String stopPlace) {
		this.stopPlace = stopPlace;
	}

	public DateTime getStartTime() {
		return startTime;
	}

	public String getStartTimeString() {
		return DateTimeFormat.forPattern("dd-MM-yyyy").print(getStartTime());
	}

	public void setStartTime(DateTime startTime) {
		this.startTime = startTime;
	}

	public Integer getDurationAtStop() {
		return durationAtStop;
	}

	public void setDurationAtStop(Integer durationAtStop) {
		this.durationAtStop = durationAtStop;
	}

	public Integer getDurationAtAll() {
		return durationAtAll;
	}

	public void setDurationAtAll(Integer durationAtAll) {
		this.durationAtAll = durationAtAll;
	}

	public Double getBudget() {
		return budget;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}

	public void addItinerary(Itinerary itinerary) {
		itineraries.add(itinerary);
	}

}
