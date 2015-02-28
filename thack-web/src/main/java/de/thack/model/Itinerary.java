package de.thack.model;

import java.util.Comparator;

import de.thack.api.sabre.model.Flight;

public class Itinerary implements Comparator<Itinerary> {

	private Flight fromOriginToTop;
	
	private Flight fromTopToDestination;

	private String topDesintion;

	public String getTopDesintion() {
		return topDesintion;
	}

	public void setTopDesintion(String topDesintion) {
		this.topDesintion = topDesintion;
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

	public double getTotalPrice() {
		return fromOriginToTop.getPrice() + fromTopToDestination.getPrice();
	}

	@Override
	public int compare(Itinerary o1, Itinerary o2) {
		return (int) (o1.getTotalPrice() - o2.getTotalPrice());
	}

}
