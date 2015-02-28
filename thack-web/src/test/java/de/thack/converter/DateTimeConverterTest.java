package de.thack.converter;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.junit.Test;

public class DateTimeConverterTest {

	@Test
	public void test() {
		DateTime parseDateTime = DateTimeFormat.forPattern("YYYY-MM-dd").parseDateTime(
				"2015-03-20");
		System.out.println(parseDateTime);
	}
	
}
