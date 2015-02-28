package de.thack.model;

import de.thack.api.sabre.model.Flight;

public class Itinerary {

	private Flight fromOriginToTop;
	private Flight fromTopToDestination;
	
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
	
}
