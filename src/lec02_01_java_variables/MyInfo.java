package lec02_01_java_variables;

public class MyInfo {
	// Java syntax is the set of rules, how Java programs are constructed
	// This is a class body
	// A class body contains first: variables, second: Constructor, third: methods
	// variables can be either declared (no value assigned) or initialized (value assigned) 
	// variables name can't be duplicated
	// variables always ended up with a semicolon ;
	// variable name starts with lower case and follow camel case and snake case pattern 
		
	// String itself is a class, represents for String type variable here
	// String is not a pure primitive data type, important interview question
	// variable declared
	public String schoolName;
	
	// variable initialized
	public String country_name = "USA";
	
	// here, public is access modifier, String is the type of the variable, 
	// myName is the name of the String type variable
	public String myName = "Tofael";
	// String type values are always inside double quotation
	
	// int is the type of the variable, "myYearlySalary" is the name of the int type variable
	public int myYearlySalary = 5672354;
	// int type values are with no quotation
	
	// char is the type of the variable, myGender is the name of the char type variable
	public char myGender = 'M';
	// char type values are always inside single quotation
	
	// boolean is the type of the variable, usCitizen is the name of the boolean type variable
	public boolean usCitizen = true;
	// boolean type values are with no quotation. Represented by 'true' or 'false' in lower case only
	
	// float are used for "non complete number" [a number with decimal]
	public float myHeight = 1.6537f;
	// we must have to use lower case f, at the end of float value
	// float type values are with no quotation
	
	// How to create a Constructor?
	// Constructor name is same as 'Class name', so starts with Upper Case 
	// and follow camel case or snake case feature
	// This Constructor is declared here	
	public MyInfo() {
		// Constructor body
		System.out.println("I am a Constructor from MyInfo Class");
	}
	
	// How to create a method?
	// This is a void type method
	// method name generally starts with lower Case 
	// and follow camel case feature or snake case pattern
	// Inside the class, method can't be declared  (very important info)
	// method implemented [when a method has a body or they have {} ]
	public void study() {
		System.out.println("I am a method from Tofael class, Now I am studying Javascript");
	}
	
	public void newYork() {
		System.out.println("I am the new york method");
	}
	
	// there can be more than one methods inside a class with different name
	public void city_bus() {
		System.out.println("I am the city_bus method");
	}
	
	// method name can be same as class name, but in lower case
	// but, this is not mandatory to make a method name as class name
	// method implemented
	public void tofael() {
		// Can I use/call variable inside method body? Ans: Yes, see next line
		// for the first time, we use variable name inside sysout
		System.out.println(myName);
		// can we use String and variable together? Ans: Yes
		// This is called concatenation to make the outcome meaningful
		System.out.println("My Name is: " + myName + ", My Yearly Salary: " 
		+ myYearlySalary + ", My Gender: " + myGender + ", My height: " + myHeight + ", US citizen? : " + usCitizen);
		System.out.println("I am the myInfo method");
	}
	
	
	public static void main(String[] args) {
		// You have to create an object generally [not mandatory] inside the main method
		// MyInfo (blue color) is a class, tofael (yellow color) is an object, also called reference type variable
		// object name always start with lower case, follow camel case or snake case feature
		// = equal operator, new is a keyword of Java
		
		// What happened below? Try to Understand, if don't, no problem
		// an object is created (tofael) (by you) from 'MyInfo' class (following blueprint) which (object) is new and MyInfo type
		// This action (line 109) --> (when an object is created from a class) is called "instantiation", (vvImp info)
		// Then we say the class (MyInfo) is instantiated or Class Instantiated

		/*
		 I will teach in the next class
		 How the variables are printing from here where variables are absent in this class?
		 Ans: Inside same package, public, protected and default type content can be accessible [this info will come later]
		 Ans: Inside different package, only public type content can be accessible [this info will come later]
		*/
		
		
		// When an object [tofael] is created from a class [MyInfo], Constructor is initialized
		// When an object is created from a class, the class is instantiated
		
		// This is not mandatory to write the object name, same as class name
		// Also, we can create more than one object from a class
		MyInfo tofael = new MyInfo();  // Constructor initialized here [When an object is created]
		
		// The object can call methods
		tofael.study(); // here method is initialized
		
		tofael.newYork();
		tofael.city_bus();
		
		tofael.tofael();
		
			
			
			
			
	}
		
		
		
		
		
		
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
