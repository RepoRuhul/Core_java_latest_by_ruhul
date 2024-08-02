package lec06_02_Java_Interface_abstractClass_and_other;

// Abstract Class contains both abstract and non abstract methods
// Abstract Class names starts with UpperCase like a regular class
// They follow Camel case or Snake case pattern.
// CamelCase or Snake_case feature considered from second word, not from first word
// CamelCase example for an Abstract Class --> ElectricCar
// Snake_case example for an Abstract Class --> Electric_car

public abstract class ElectricCar {
	
	// non abstract method or implemented method
	public void battery() {
		System.out.println("The battery is very efficient and is from ElectricCar Abstract class");
	}
	
	// method declared below
	// when method is declared, that method is also called abstract method
	// This is "mandatory to put abstract keyword" with the abstract method inside Abstract Class
	// This is the norm/rules to "write at least one abstract method" inside abstract class
	public abstract void price();

}
