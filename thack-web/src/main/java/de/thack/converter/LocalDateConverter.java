package de.thack.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

@FacesConverter(value = "localDateConverter")
public class LocalDateConverter implements Converter {
	public Object getAsObject(FacesContext facesContext,
			UIComponent uiComponent, String localDateInTextFormat) {
		return DateTimeFormat.forPattern("yyyy-MM-dd").parseDateTime(
				localDateInTextFormat);
	}

	public String getAsString(FacesContext facesContext,
			UIComponent uiComponent, Object localDate) {
		return DateTimeFormat.forPattern("yyyy-MM-dd").print(
				(DateTime) localDate);
	}
}