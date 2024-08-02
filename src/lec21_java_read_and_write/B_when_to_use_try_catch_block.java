package lec21_java_read_and_write;

/*
An Exception is an unwanted event that interrupts the normal flow of the program 
that happens during the run time. When an exception occurs program execution gets terminated.
In such cases, we get a system-generated error message.

How can we handle exception? -- very very important interview question
By --> try, catch, finally, throw, throws
*/

public class B_when_to_use_try_catch_block {

	public static void main(String[] args) {
		int a = 34;
		int b = 0;
		try {
			int division = a/b;
			System.out.println(division);
		} catch(ArithmeticException e) {
			System.out.println("The Exception occured here is >>>>>> " + e);
			// e.printStackTrace(); // sometimes we will see this method is used as alternate
		}
		System.out.println("Code is continuing, because exception is handled");	
		// This will be printed because normal flow of the Application is handled by try catch block
	}
		// try catch block is not an alternate of if else condition
}
