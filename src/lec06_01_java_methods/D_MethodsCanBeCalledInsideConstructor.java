package lec06_01_java_methods;

public class D_MethodsCanBeCalledInsideConstructor {
	// Global variable or class variable
	public int a = 13;
	public int b = 2;
	
	protected String firstName = "Alex";
	String lastName = "Fergunson"; // Here access modifier is 'default'
	
	public D_MethodsCanBeCalledInsideConstructor() {
		addition();
		subtraction();
		// We can can call methods inside Constructor too.
		// Why we put methods inside constructor?
		// if a class is instantiated [when object is created], constructor is initialized, 
		// If we need some methods working during instantiation [object creation], then it helps
		System.out.println("I am coming from Constructor body\n");
	}
	
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
