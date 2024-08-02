package lec06_01_java_methods;

public class C_MethodsCanBeCalledInsideAnotherMethod {
	// Global variable or class variable
	public int a = 13;
	public int b = 2;
	
	protected String firstName = "Alex";
	String lastName = "Fergunson"; // Here access modifier is 'default'
	
	public void addition() {
		int sum = a+b; // called local variable, because belongs to the 'addition' method only
		System.out.println("Additon of a and b is: " + sum);
	}
	
	// return type method
	// this method is returning int data type
	// return keyword should be the last statement of return type method
	public int subtraction() {
		int total = a-b;
		System.out.println("Subtraction of a and b is: " + total);
		myName();
		return total;
	}
	
	// return type method which is returning String data type
	public String myName() {
		String fullName = firstName + " " + lastName;
		System.out.println(fullName);
		return fullName;
	}
	
}
