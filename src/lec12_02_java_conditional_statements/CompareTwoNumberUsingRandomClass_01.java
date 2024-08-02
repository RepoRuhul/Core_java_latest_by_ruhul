package lec12_02_java_conditional_statements;

import java.util.Random;

public class CompareTwoNumberUsingRandomClass_01 {

	public static void main(String[] args) {
		// Random class choose number randomly
		Random random = new Random();
		int val1 = random.nextInt(1000);
		int val2 = random.nextInt(1000); // we can put a range of 100 or 1000 or 55 inside parentheses
		// choosing  a range is not mandatory, if no range given,  it will randomly choose any number from int range (positive or negative)
		// but range/bound used in line 10 or 11, can't be negative
		
		if (val1>val2) {
			System.out.println(val1 + " is greater than " + val2);
		} else if (val1<val2) {
			System.out.println(val1 + " is smaller than " + val2);
		} else if (val1==val2) {
			System.out.println(val1 + " is equal to " + val2);
		} else {
			System.out.println("Please provide a correct number");
		}
		
	}

}
