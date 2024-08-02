package lec08_01_java_oop_inheritance;

// Line 4 is not possible, because you can use only one extends keyword
// public class Cousin1 extends Aunt extends GrandFather {

public class Cousin extends Aunt {
	public void cousinInfo() {
		System.out.println("Cousin: Maya, Aunt: Jamila, Grandfather: Ismail");
	}
}
