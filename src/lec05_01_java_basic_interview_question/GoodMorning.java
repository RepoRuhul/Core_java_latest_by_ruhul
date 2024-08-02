package lec05_01_java_basic_interview_question;

// we are learning print() vs println()
// println() is mostly used

public class GoodMorning {

	public static void main(String[] args) {
		System.out.print("Good Morning! ");
		System.out.print("How are you All? ");
		System.out.print("We are going to learn print vs prinln method.");
		System.out.print(" Do you guys get it?");
		System.out.println(" If Yes, That's Great!");
		// although above line is println(), but the previous 4 is print() and will continue printing together
		System.out.println("If No, Please ask me Question.");
		
		// Another type you can see, I will not use
		System.err.println("To show the Error, we use this, outcome in red color");
		
	}

}
// what the println() method do? --> Terminates the current line by writing the line separator string.
// println() -- print line by line
// print() -- print continuously, not line by line, connect the next outcome
// You can make it readable by putting a space at the end or at the beginning of next line
