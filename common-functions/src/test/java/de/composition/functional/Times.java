package de.composition.functional;

import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Times {

	public static DateTime utcDateTime(String yyyyMMddHHmm) {
		DateTimeFormatter fmt = DateTimeFormat
				.forPattern("yyyy-MM-dd HH:mm");
		return fmt.parseDateTime(yyyyMMddHHmm);
	}
	
	public static  Interval interval(String from, String until) {
		return new Interval(utcDateTime(from), utcDateTime(until));
	}


}
