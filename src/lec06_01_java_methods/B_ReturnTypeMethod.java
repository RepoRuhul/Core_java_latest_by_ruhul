package lec06_01_java_methods;

public class B_ReturnTypeMethod {
	// Global variable or class variable
	public int a = 13;
	public int b = 2;
	
	protected String firstName = "Alex";
	String lastName = "Fergunson"; // Here access modifier is 'default'
	
	// void type method
	// This method never say what type of parameterized outcome we are getting
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
		return total;
	}
	
	// return type method which is returning String data type
	public String myName() {
		String fullName = firstName + " " + lastName;
		System.out.println(fullName);
		return fullName;
	}
	
	public byte myAge() {
		return 0;
	}
	
	// You should memorize below info
	
	// default value of byte is 0
	// default value of short is 0
	// default value of int is 0
	// default value of long is 0
	
	// default value of float is 0.0
	// default value of double is 0.0
	
	// default value of char [eclipse cannot recognize it, but that is a uni code value]
	// default value of boolean is false
	
	// default value of String is null
	
	
	
	
	
	
	
	

}
