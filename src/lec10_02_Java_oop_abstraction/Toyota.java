package lec10_02_Java_oop_abstraction;

// A regular class
// A regular class can inherit only one (regular class or one abstract class) by extends keyword
// A regular class can't inherit an Interface by extends keyword

// implements keyword is used to inherit Interface in regular class
// a regular class can inherit more than one Interface
// a regular class cannot inherit a regular class or abstract class by implements keyword 

// Here Toyota is child class and parent class in Mercedez and parent Interface is Car and Drone
public class Toyota extends ElectricCar implements Car, Drone{
	// Global variable or class variable
	// Inside a class, variable can be declared or initialized
	public int priceOfToyota;
	public int yearOfManufacture = 1885;

	// Constructor is declared inside Class
	public Toyota () {
		System.out.println("This constructor is from Toyota class");
	}
	
	// method implemented inside a class, but not declared or defined
	// This is a very very important interview question
	// called non abstract method or implemented method
	public void toyota() {
		System.out.println("This method is from Toyota Class");
	}
	
	// return type method can also be created inside the regular class
	public int toyotaPrice() {
		int price = 45000; // local variable
		System.out.println(price);
		return price;
	}
	
	// we can also create parameterized method
	
	// Default methods are allowed only in interfaces, not in regular class
	/*
	public default void toyotaColor () {
		
	}
	*/
	
	// static method is a local method, can be used inside Regular class
	public static void countryOfOrigin() {
		System.out.println("Made in Japan");
	}

	@Override
	public void rent() {
		System.out.println("rent method from Taxi Interface");
		
	}

	@Override
	public void carryingPassenger() {
		System.out.println("carryingPassenger method from Taxi Interface");
		
	}

	@Override
	public void carryingGoods() {
		System.out.println("carryingGoods method from Truck Interface");
		
	}

	@Override
	public void start() {
		System.out.println("start method from Car Interface");
		
	}

	@Override
	public void stop() {
		System.out.println("stop method from Car Interface");
		
	}

	@Override
	public void lightWeight() {
		System.out.println("lightWeight method from Drone Interface");		
	}

	@Override
	public void expensive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void canFloat() {
		System.out.println("canFloat method from HoverCar Interface");		
	}

	@Override
	public void price() {
		System.out.println("price method from ElectricCar Abstract class");		
	}

	@Override
	public String brake(String brakeName) {
		String m = "brake method from Car Interface";
		System.out.println(m);
		return m;
	}

	@Override
	public String carName() {
		System.out.println("carName method from Electric Car Abstract class");
		return null;
	}

	@Override
	public void autoPilot() {
		System.out.println("autoPilot method from Flying Car Abstract class");		
	}
	
	// Before Polymorphism class, Student should see return type method, casting
	// static method, final method

}
