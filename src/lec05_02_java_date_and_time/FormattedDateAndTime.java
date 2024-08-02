package lec05_02_java_date_and_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattedDateAndTime {

	public static void main(String[] args) {
		// Local Date and Time
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Before Formatting ::::> " + localDateTime);
		
		/*
	    The ofPattern() method accepts all sorts of values, if you want to display the date and time in a different format
	    yyyy-MM-dd 
	    dd/MM/yyyy
	    dd-MMM-yyyy
	    E, MMM dd, yyyy [Example: Thu Nov 22, 2018]
	    E --> Day, HH is used for Military time [+12hr after noon]
	    yyyyMMddhhmmssns ---> here ns is neno second
	    */
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMddhhmmssns");
		String formattedDateAndTime = dateTimeFormatter.format(localDateTime);
		System.out.println("After Formatting ::::> " + formattedDateAndTime);
		
		
	}

}
