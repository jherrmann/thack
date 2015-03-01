package de.thack.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.joda.time.DateTime;

import de.thack.api.getyourguide.model.Tour;
import de.thack.api.sabre.model.Flight;

public class Itinerary implements Comparator<Itinerary> {

	private Flight fromOriginToTop;
	
	private Flight fromTopToDestination;

	private String topDestination;
	
	private List<Tour> tours = new ArrayList<>();

	public List<Tour> getTours() {
		return tours;
	}
	
	public void setTours(List<Tour> tours) {
		this.tours = tours;
	}

	public String getTopDestination() {
		return topDestination;
	}

	public void setTopDestination(String topDesintion) {
		this.topDestination = topDesintion;
	}

	public Itinerary(Flight fromOriginToTop, Flight fromTopToDesFlight) {
		this.fromOriginToTop = fromOriginToTop;
		this.fromTopToDestination = fromTopToDesFlight;
	}

	public Itinerary() {
	}

	public Flight getFromOriginToTop() {
		return fromOriginToTop;
	}

	public void setFromOriginToTop(Flight fromOriginToTop) {
		this.fromOriginToTop = fromOriginToTop;
	}

	public Flight getFromTopToDestination() {
		return fromTopToDestination;
	}

	public void setFromTopToDestination(Flight fromTopToDestination) {
		this.fromTopToDestination = fromTopToDestination;
	}
	
	public void addTour(Tour tour){
		this.tours.add(tour);
	}

	public double getTotalPrice() {
		double flightPrice = fromOriginToTop.getPrice() + fromTopToDestination.getPrice();
		double tourPrice = 0;
		for (Tour tour : tours) {
			tourPrice += Double.valueOf(tour.getPrice().getValues().getAmount().toString());
		}
		return flightPrice + tourPrice;
	}

	@Override
	public int compare(Itinerary o1, Itinerary o2) {
		return (int) (o1.getTotalPrice() - o2.getTotalPrice());
	}

}
