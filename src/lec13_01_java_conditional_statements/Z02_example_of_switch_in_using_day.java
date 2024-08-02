package lec13_01_java_conditional_statements;


import java.util.Scanner;

public class Z02_example_of_switch_in_using_day {

	public static void main(String[] args) {
		System.out.println("<-- Please print a day -->");
		Scanner scanner = new Scanner(System.in);
		String day = scanner.nextLine();

		switch (day) {

		case "Saturday":
			System.out.println("Lunch Menu: Rice and Fish");
			break;

		case "Sunday":
			System.out.println("Lunch Menu: Biriyani");
			break;

		case "Monday":
			System.out.println("Lunch Menu: Rice and Chicken");
			break;

		case "Tuesday":
			System.out.println("Lunch Menu: Rice and Beef");
			break;

		case "Wednesday":
			System.out.println("Lunch Menu: Rice and Lamb");
			break;

		case "Thursday":
			System.out.println("Lunch Menu: Pizza");
			break;

		case "Friday":
			System.out.println("Lunch Menu: Burger");
			break;

		default:
			System.out.println("Please put a valid Day!!");
			break;
		}

		scanner.close();

	}

}
