package lec05_02_java_date_and_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DisplayCurrentDateAndTime {

	public static void main(String[] args) {
		// Local Date
		LocalDate localDate = LocalDate.now();
		System.out.println("Local Date: " + localDate);

		// Local Time
		LocalTime localTime = LocalTime.now();
		System.out.println("Local Time: " + localTime);

		// Local Date and Time
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Local Date and Time: " + localDateTime);
	}

}
