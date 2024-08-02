package lec21_java_read_and_write;

/*
An Exception is an unwanted event that interrupts the normal flow of the program 
that happens during the run time. When an exception occurs program execution gets terminated.
In such cases, we get a system-generated error message.

How can we handle exception? -- very very important interview question
By --> try, catch, finally, throw, throws
*/

public class C_when_to_use_throws {
	public int a = 34;
	public int b = 0;
	
	public void division() throws ArithmeticException {
		int div = a/b;
		System.out.println(div);
			
	}

	public static void main(String[] args) {
		C_when_to_use_throws c = new C_when_to_use_throws();
		c.division();
		System.out.println("Code is continuing, because exception is handled");
	}
}
