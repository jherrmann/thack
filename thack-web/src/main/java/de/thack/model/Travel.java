package de.thack.model;

import org.joda.time.DateTime;

public class Travel {

	private String startPlace;

	private String stopPlace;

	private DateTime startTime;

	private DateTime stopTime;

	private Integer durationAtStop;

	private Integer durationAtAll;

	private Double budget;

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

	public void setStartTime(DateTime startTime) {
		this.startTime = startTime;
	}

	public DateTime getStopTime() {
		return stopTime;
	}

	public void setStopTime(DateTime stopTime) {
		this.stopTime = stopTime;
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

}
