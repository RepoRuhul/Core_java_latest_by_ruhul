package lec13_01_java_conditional_statements;


import java.util.Scanner;

public class Z03_example_of_switch_in_using_day {

	public static void main(String[] args) {
		System.out.println("<-- Please print a day -->");
		Scanner scanner = new Scanner(System.in);
		int day = scanner.nextInt();

		String menu = "";
		
		
		switch (day) {

		case 1:
			menu = "Lunch Menu: Rice and Fish";
			break;

		case 2:
			menu = "Lunch Menu: Biriyani";
			break;

		case 3:
			menu = "Lunch Menu: Rice and Chicken";
			break;

		case 4:
			menu = "Lunch Menu: Rice and Beef";
			break;

		case 5:
			menu = "Lunch Menu: Rice and Lamb";
			break;

		case 6:
			menu = "Lunch Menu: Pizza";
			break;

		case 7:
			menu = "Lunch Menu: Burger";
			break;

		default:
			System.out.println("Please put a valid Number for the Day!!");
			break;
		}
		System.out.println("Your Choose " + menu);
		scanner.close();

	}

}
