package lec12_01_Java_oop_abstraction_final;

public class VehicleTest {

	public static void main(String[] args) {
		System.out.println("\n--------------------- Regular class Toyota ------------------------\n");
		Toyota toyota = new Toyota();
		toyota.toyota();
		toyota.start();
		toyota.stop();
		toyota.price();
		toyota.brake("Salil");
		toyota.battery();
		toyota.honk();
				
		System.out.println("\n--------------------- Interface Car ------------------------\n");
		Car car = new Toyota();
		car.start();
		car.stop();
		car.brake("Mahindar");
		car.honk();
		Car.gear();
		System.out.println("The Car invented in: " + Car.invented);		
		
		System.out.println("\n--------------------- Abstract class ElectricCar ------------------------\n");
		ElectricCar electricCar = new Toyota();		
		electricCar.battery();
		electricCar.price();
		
	}

}
