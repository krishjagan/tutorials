package com.my_tutorials.java8;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

	public static void main(String[] args) {

		// current date
		System.out.println("Current Date : " + LocalDate.now());

		// set the date as individual parameters
		System.out.println(LocalDate.of(2021, Month.MAY, 05));

		// set the date as String
		System.out.println(LocalDate.parse("2021-01-01"));

		// add 2 months to current date.
		System.out.println("Add 2 months to current date : " + LocalDate.now().plusMonths(2));

		// minus 2 days from current date.
		System.out.println("Minus 2 days from current date : " + LocalDate.now().minusDays(2));

		// format the date
		System.out.println(
				"format the date in yyyy/MM/dd : " + LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));

		// get the current time in EST time zone
		System.out.println("Current time in EST : " + LocalDateTime.now(ZoneId.of("America/New_York")));

		// date time with time zone
		System.out.println(
				"Date time with Timezone : " + ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("America/New_York")));

		// get the time in specific format
		String localtime = LocalTime.now().format(DateTimeFormatter.ofPattern("h:m a"));
		System.out.println(localtime);
		
		
	}

}
