package lec10_01_java_oop_use_of_super_in_child_class;

// child class/sub Class: Employee, Parent Class/Base Class/Super Class: MountSiani
// Above line is important, Memorize it, all names are used in industry
public class Employee extends MountSinai {
	// Global variable declared
	public String empName;
	public int empId;
	public char empGender;
	public boolean fullTimeEmp;
	
	// default Constructor
	// super() method is used to call/initialize the default constructor of super (parent/base) class 
	// try to put the super method (after sysout of default constructor) and find the below outcome
	// Constructor call must be the first statement inside a constructor of the child class 
	// We can use only one super() method inside one constructor
	// Either default (line 20)  or parameterized constructor (line 21) can be called/initialized by super method from the super class,
	// That's why we use java comments in the below line 20
	public Employee() {
		// super();
		super("Bronx", 6);
		
		// super keyword is used to call (initialize) any types of method from super (Parent) class
		super.msInfo();
		super.mountSinaiInfo("Staten Island", 7);
		super.mountSinaiInfo("Terry Town", 8);
		
		// super keyword is also used to call (initialize) the variables of super (Parent) class
		super.inNewYork = true;
		super.rating = 9.23f;
		System.out.println("Is this hospital in NY? Ans: " + inNewYork + " and The rating is: " + rating);		
		
		System.out.println("This is a default constructor from the Child class Employee");
	}

	// parameterized Constructor
	// Inside Parameterized Constructor, super() and super keyword do same function like they did inside default constructor
	public Employee(String empName, int empId, char empGender, boolean fullTimeEmp) {
		// super();
		super("Brooklyn", 10);
		
		super.msInfo();
		super.mountSinaiInfo("Nassau County", 10);
		
		super.inNewYork = false;
		super.rating = 9.004f;
		System.out.println("Is this hospital in NY? Ans: " + inNewYork + " and The rating is: " + rating);
		
		this.empName = empName;
		this.empId = empId;
		this.empGender = empGender;
		this.fullTimeEmp = fullTimeEmp;
		System.out.println("Name: " + empName + ", Id: " + empId + ", Gender: " + empGender + " and Full time employee? : " + fullTimeEmp);
	}
	
	// void type or no return method or non parameterized method
	public void empInfo() {
		// Inside a method of the child class, we can't call constructor of super class by super().
		// super();
		
		super.msInfo();
		super.mountSinaiInfo("Orange County", 15);
		
		super.inNewYork = false;
		super.rating = 9.332f;
		System.out.println("Is this hospital in NY? Ans: " + inNewYork + " and The rating is: " + rating);		
		
		
		System.out.println("This is a void type method from child class Employee");
	}
	
	// parameterized method
	public void employeeInfo(String empName, int empId, char empGender, boolean fullTimeEmp) {
		// we can't call constructor of super class inside a method of child class.
		// super();

		super.msInfo();
		super.mountSinaiInfo("Staten Island", 19);

		super.inNewYork = true;
		super.rating = 9.8f;
		System.out.println("Is this hospital in NY? Ans: " + inNewYork + " and The rating is: " + rating);

		System.out.println("Name: " + empName + ", Id: " + empId + ", Gender: " + empGender + " and Full time employee? : " + fullTimeEmp);
	}

}
