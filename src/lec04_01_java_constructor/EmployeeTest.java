package lec04_01_java_constructor;

public class EmployeeTest {

	public static void main(String[] args) {
		// When class is instantiated, means when object is created, Constructor is Initialized
		// default Constructor Initialized
		Employee employee = new Employee();
		
		System.out.println("------------------------------------------------");
		// Parameterized Constructor Initialized -01
		// Parameterized have advantage, you can reuse
		// Here "Joe Biden" is called 'argument' which is String type
		Employee joe = new Employee("Joe Biden");
		Employee bill = new Employee("Bill Clinton");
		// Employee employee4 = new Employee('M');
		
		System.out.println("------------------------------------------------");
		// Parameterized Constructor Initialized -02
		// Here "Alex F" is called 'argument' which is String type
		// Here 21450 is called 'argument' which is int type
		// Here 'M' is called 'argument' which is char type
		// Here false is called 'argument' which is boolean type		
		Employee alex = new Employee("Alex F", 21450, 'M', false);
		
		System.out.println("------------------------------------------------");
		Employee elena = new Employee("Elena C", 23272, 'F', true);
		
		System.out.println("------------------------------------------------\n");
		Employee reegan = new Employee("Reegan", 63547, 'M', true);
		// The sequence of argument should be same as parameter inside the parameterized constructor
		// But before we should send same number of parameter
		
		System.out.println("------------------------------------------------\n");
		// Parameterized Constructor initialized -03
		Employee johnson = new Employee("Johnson B", 63547, 'M');
		
		System.out.println("------------------------------------------------\n");
		// Parameterized Constructor Initialized -04
		Employee jimmy = new Employee("Jimmy C", 6823, false, 'M');
		
		// Advantage of Parameterized Constructor: We can initialized arguments for multiple people
		

	}

}
