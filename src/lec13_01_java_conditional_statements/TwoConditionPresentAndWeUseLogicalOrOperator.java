package lec13_01_java_conditional_statements;

import java.util.Scanner;

// Use of 'logical or operator' is not common in the industry, just know how this work!
// Use of logical or operator '||' (called pipe symbol)
// This is same as before just changed && to ||

public class TwoConditionPresentAndWeUseLogicalOrOperator {

	public static void main(String[] args) {
		System.out.println("---: Please Put the values in the console :---");
		Scanner scanner = new Scanner(System.in);
		int val1 = scanner.nextInt();
		int val2 = scanner.nextInt();
		
		if (val1 % 2 == 0 || val1 < val2) {
			System.out.println(val1 + " is an even number or " + val1 + " smaller than " + val2);
		} else if (val1 % 2 == 0 || val1 > val2) {
			System.out.println(val1 + " is an even number or " + val1 + " greater than " + val2);
		} else if (val1 % 2 == 0 || val1 == val2) {
			System.out.println(val1 + " is an even number or " + val1 + " is equal to " + val2);
		} else if (val1 % 2 == 1 || val1 < val2) {
			System.out.println(val1 + " is an odd number or " + val1 + " smaller than " + val2);
		} else if (val1 % 2 == 1 || val1 > val2) {
			System.out.println(val1 + " is an odd number or " + val1 + " greater than " + val2);
		} else if (val1 % 2 == 1 || val1 == val2) {
			System.out.println(val1 + " is an odd number or " + val1 + " is equal to " + val2);
		} else {
			System.out.println("The system failed to execute your outcome");
		}
		scanner.close();		
	}

}