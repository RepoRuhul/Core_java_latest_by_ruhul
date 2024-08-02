package lec12_01_Java_oop_abstraction_final;

public interface Car {

	public static final int invented = 1800;

	public void start();
	public abstract void stop();
	public String brake(String brakeName);
	
	public default void honk() {
		System.out.println("This Honk feature came from Car Interface");
	}
	
	public static void gear() {
		System.out.println("This Gear feature is from Car Interface");
	}

}
