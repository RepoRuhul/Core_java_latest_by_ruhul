package lec06_01_java_methods;

public class F_LearningParameterizedMethod {
	
	// void type method
	// Advantage of parameterized methods is, it can be reused by changing the arguments
	public void addition(int a, int b) { // a and b is the parameter here
		// Inside method, we don't need a relation between variable and parameter like Parameterized Constructor
		int sum = a + b;
		System.out.println("Additon of a and b is: " + sum);
	}
	
	// can a method be parameterized when they are return type
	// if a method is parameterized, then no need of variables as 'c' and 'd'
	public int multiplication(int c, int d) {
		int multi = c*d;		
		System.out.println("Multiplied outcome is: " + multi);
		return multi;
	}
	
	public String myName (String fn, String ln) {
		String name = fn + " " + ln;
		System.out.println("My Name: " + name); 
		return fn + " " + ln; // we can also write like this
	}
	
	// parameterized method can be void type or return type
	
	
	

}
