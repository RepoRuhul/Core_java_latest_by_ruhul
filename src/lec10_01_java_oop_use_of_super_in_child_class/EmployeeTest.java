package lec10_01_java_oop_use_of_super_in_child_class;

public class EmployeeTest {

	public static void main(String[] args) {
		System.out.println("\n---------- default constructor initialized from The Child Class Employee -----------");
		Employee employee = new Employee();
		// A child class object can inherit properties from Parent class
		// Java comments to next 2 line as this is not our topic
//		employee.msInfo();
//		employee.mountSinaiInfo("ABC", 10);
		
		System.out.println("\n---------- parametrized constructor initialized from The Child Class Employee -----------");
		Employee employee2 = new Employee("Mohammad Sharkar", 2188458, 'M', false);
		
		System.out.println("\n---------- void type method initialized from The Child Class Employee -----------");
		employee2.empInfo();
		
		System.out.println("\n---------- parameterized method initialized from The Child Class Employee -----------");
		employee2.employeeInfo("Julie Armstrong", 527364, 'F', true);

		System.out.println("\n---------- default constructor initialized from The Parent Class Mount Sinai -----------");
		MountSinai mountSinai = new MountSinai();
		
		System.out.println("\n---------- parameterized constructor initialized from The Parent Class Mount Sinai -----------");
		MountSinai mountSinai2 = new MountSinai("Manhattan", 4);
		
		System.out.println("\n---------- void type method initialized from The Parent Class Mount Sinai -----------");
		mountSinai2.msInfo();
		
		System.out.println("\n---------- parameterized method initialized from The Parent Class Mount Sinai -----------");
		mountSinai2.mountSinaiInfo("Queens", 3);
		
		
		/*
		 Summary:
		 1) super method or super keyword is used inside child class (not in parent class)
		 2) super method or super keyword is an alternative of creating object from child class and call parent class properties
		 
		 */
		
		
		
		
		
	}

}
