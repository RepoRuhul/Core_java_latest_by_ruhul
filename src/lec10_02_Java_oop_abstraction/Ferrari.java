package lec10_02_Java_oop_abstraction;

// if both extends and implements present, extends keyword used before implements keyword
// if extends keyword not present, we can use implements keyword alone
// if implements keyword not present, we can use extends keyword alone

public class Ferrari implements CableCar{
	public void ferrariInfo() {
		System.out.println("Invented in Italy");
	}

	@Override
	public void cheap() {
		System.out.println("cheap method is from CableCar Interface");		
	}

}
