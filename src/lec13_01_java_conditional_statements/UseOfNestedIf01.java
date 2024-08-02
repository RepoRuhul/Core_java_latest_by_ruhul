package lec13_01_java_conditional_statements;

import java.util.Scanner;

public class UseOfNestedIf01 {

	public static void main(String[] args) {
		// Condition: To donate blood, you must be greater than or equal to 18 years old and your weight should be more than 50 kg 
		System.out.println("---: Please Enter your age here :---");
		Scanner scanner = new Scanner(System.in);
		// Creating variable for age
		int age = scanner.nextInt();
		
		// applying condition on age
		if(age>=18) { // outer if block
			System.out.println("Please Enter your weight here: ");
			// Creating variable for weight
			int weight = scanner.nextInt();
			
			// applying condition for weight
			if (weight>50) { // nested if block
				System.out.println("You are eligible to donate blood as your weight is " + weight + " kg and age is " +  age);
			} else {
				System.out.println("You are not eligible to donate blood as your weight is " + weight + " kg, although age is " +  age);
			}
		
		} else {
			System.out.println("First, Your age should be more than or equal to 18 to donate blood");
		}
	}

}
