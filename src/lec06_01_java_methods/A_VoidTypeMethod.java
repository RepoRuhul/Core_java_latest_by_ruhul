package lec06_01_java_methods;

public class A_VoidTypeMethod {
	// Global variable or class variable
	public int a = 13;
	public int b = 2;
	
	// void type method
	// This method never say what type of parameterized outcome we are getting
	public void addition() {
		int sum = a+b; // called local variable, because belongs to the 'addition' method only
		System.out.println("Additon of a and b is: " + sum);
	}

}
