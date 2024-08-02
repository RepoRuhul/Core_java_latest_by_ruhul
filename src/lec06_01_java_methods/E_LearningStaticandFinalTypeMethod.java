package lec06_01_java_methods;

public class E_LearningStaticandFinalTypeMethod {
	// Global variable or class variable
	public static int a = 13; // why static? please see line 14
	public static int b = 2;
	
	protected String firstName = "Alex";
	String lastName = "Fergunson"; // Here access modifier is 'default'
	
	// void type static method
	// static is a local member method of this class
	// other class can't call it
	public static void addition() {
		int sum = a+b; // non static variable can'r be called inside static method
		System.out.println("Additon of a and b is: " + sum);
	}
	
	// return type final method
	// when there is a final keyword, you can't change the method
	public final int subtraction() {
		int total = a-b;
		System.out.println("Subtraction of a and b is: " + total);
		return total;
	}
	
	// static and final "keyword" can be used for void, return or parameterized method
}
