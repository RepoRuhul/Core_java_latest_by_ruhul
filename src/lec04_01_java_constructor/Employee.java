package lec04_01_java_constructor;

public class Employee {
	// variables declared/defined
	// Class variable or Global variable
	public String empName;
	public int empId;
	public char empGender;
	public boolean fullTimeEmployee;
	
	// Constructor are 2 types --
	// default constructor (no argument constructor) and parameterized constructor
	// A class can contain one default constructor and one or (more than one) parameterized constructor
	// Default Constructor must be declared before parameterized constructor.
	// You shouldn't write a parameterized constructor without writing a default constructor. It's a norm.
		
	// default Constructor is declare/define
	public Employee() {
		System.out.println("I am a Constructor from Employee Class");
	}
	
	// Parameterized constructor declared -01
	// parameter name can not be same as variable
	public Employee(String employeeName) {
		this.empName = employeeName;
		System.out.println("Employee Name: " + employeeName);
	}

	// Parameterized Constructor declared -02
	// here in line 26, empName is called parameter, in line 6, that is variable, same for others
	// 'this' keyword represents an instance of the class. 
	// 'this' keyword can be used to access class methods and variables.
	public Employee(String empName, int empId, char empGender, boolean fullTimeEmployee) {
		super(); // we don't need it now
		this.empName = empName;
		this.empId = empId;
		this.empGender = empGender;
		this.fullTimeEmployee = fullTimeEmployee;
		System.out.println("Employee Name: " + empName + ", Employee ID: " + empId + 
				", Employee Gender: " + empGender + ", Full Time Employee: " + fullTimeEmployee);
	}

	// Parameterized Constructor declared -03
	public Employee(String empName, int empId, char empGender) {
		this.empName = empName;
		this.empId = empId;
		this.empGender = empGender;
		// The outcome is same as line 39, it doesn't matter --> what is the sequence in outcome
		// if some parameters are absent, they will show default value
		System.out.println("Employee Name: " + empName + ", Employee ID: " + empId + 
				", Employee Gender: " + empGender + ", Full Time Employee: " + fullTimeEmployee);
	}
	
	// you can create other parameterized constructor with same number of parameter but the position of parameter is different
	// Parameterized Constructor declared -04
	public Employee(String empName, int empId, boolean fullTimeEmployee, char empGender) {
		super(); // we don't need it now
		this.empName = empName;
		this.empId = empId;
		this.empGender = empGender;
		this.fullTimeEmployee = fullTimeEmployee;
		// we didn't use other 3 parameters, this is fine too
		System.out.println("Full Time Employee: " + fullTimeEmployee);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
