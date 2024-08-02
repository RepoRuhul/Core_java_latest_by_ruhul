package lec07_02_java_different_type_of_class;

import java.util.Scanner;

public class Use_of_scanner_class04 {
	public static void main(String[] args) {
		System.out.println("Please Input score accordingly");
		Scanner scanner = new Scanner(System.in); // this Scanner class allow me to write in the console
		float scoreInHW = scanner.nextFloat();
		float scoreInQuiz = scanner.nextFloat();
		
		float averageScore = (scoreInHW + scoreInQuiz)/2;
		// no need to use f in the console, because float type use f at the Editor.
		System.out.println("\nThe Average Score of mine in this course is: " + averageScore);
		scanner.close();
	}

}
