package lec11_01_java_oop_polymorphism;

public class TestCalculator {

	public static void main(String[] args) {
		System.out.println("-------- Land Calculator --------");
		LandCalculator lc = new LandCalculator();
		lc.landCalculator(); // void type method -01 initialized
		lc.landCalculator(23, 86);  // void type parameterized method -02 initialized
		lc.landCalculator(13, 8);  // return type parameterized method -02 initialized
		lc.landCalculator(23, 86, 10);  // return type parameterized method -03 initialized
		lc.landCalculator(23, "86", 10);  // void type parameterized method -04 initialized
		lc.landCalculator(3.5374f, "32", 100); // return type parameterized method -05 initialized
		lc.landCalculator(23, 86, 10, 34);  // return type parameterized method -06 initialized
		LandCalculator.landCalculator(23, 86, 10, 34, 53); // return type parameterized method -07 initialized
		
		System.out.println("\n-------- Modern Calculator --------");
		ModernCalculator mc = new ModernCalculator();
		mc.landCalculator();
		mc.landCalculator(23, 86);
		mc.landCalculator(23, 86, 10);  // return type parameterized method -03 initialized
		mc.landCalculator(23, "86", 10);  // void type parameterized method -04 initialized
		mc.landCalculator(3.5374f, "32", 100); // return type parameterized method -05 initialized

	}

}
