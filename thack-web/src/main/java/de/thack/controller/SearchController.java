package de.thack.controller;

import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import de.thack.model.Travel;

@Named
@RequestScoped
public class SearchController {

	@Inject
	private FacesContext facesContext;

	@Inject
	private Logger logger;

	@Named
	@Produces
	@RequestScoped
	private Travel travel = new Travel();

	public void search() {
		logger.info("Wassss uppp");
		logger.info(travel.getStartPlace());
		logger.info(travel.getStartTime().toString());
	}

	public Travel getTravel() {
		return travel;
	}

	public void setTravel(Travel travel) {
		this.travel = travel;
	}

}
