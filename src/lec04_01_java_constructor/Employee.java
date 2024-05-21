package lec04_01_java_constructor;

public class Employee {
	// variables declared/defined
	// Class variable or Global variable (based on where they are present)
	public String empName;
	public int empId;
	public char empGender;
	public boolean fullTimeEmployee;
	
	// Constructor are 2 types --
	// default constructor (no argument constructor) and parameterized constructor
	// A class can contain one default constructor and one or (more than one) parameterized constructor
	// Default Constructor must be declared before parameterized constructor.
	// You shouldn't write a parameterized constructor without writing a default constructor. It's a norm.
		
	// default Constructor is declared/defined
	public Employee () {
		System.out.println("I am a Constructor from Employee Class");
	}

	// Parameterized constructor declared -01
	// here in line 27, empName is called parameter, in line 6, that is variable, same for others
	// Here empName, empId, empGender, fullTimeEmployee are called parameter, and they have their own data type
	// 'this' keyword represents an instance of the class. 
	// 'this' keyword can be used to access class methods and variables.
	public Employee(String empName, int empId, char empGender, boolean fullTimeEmployee) {
		super(); // we don't need it now, you can keep it or delete it
		this.empName = empName;
		this.empId = empId;
		this.empGender = empGender;
		this.fullTimeEmployee = fullTimeEmployee;
		System.out.println("Employee Name: " + empName + ", Employee ID: " + empId + 
				", Employee Gender: " + empGender + ", Full Time Employee: " + fullTimeEmployee);
	}

	// Parameterized constructor declared -02
	public Employee(int empId, char empGender, String empName, boolean fullTimeEmployee) {
		this.empId = empId;
		this.empGender = empGender;
		this.empName = empName;
		this.fullTimeEmployee = fullTimeEmployee;
		// The below outcome [syso] is same as line 33, it doesn't matter, what is the sequence present there
		// matter is how parameters are written, and arguments are presented at same sequence
		System.out.println("Employee Name: " + empName + ", Employee ID: " + empId + 
				", Employee Gender: " + empGender + ", Full Time Employee: " + fullTimeEmployee);
	}

	// Parameterized constructor declared -03
	public Employee(String empName, int empId, char empGender) {
		this.empName = empName;
		this.empId = empId;
		this.empGender = empGender;
		// if some parameters are absent, they will show default value from below line
		System.out.println("Employee Name: " + empName + ", Employee ID: " + empId + 
				", Employee Gender: " + empGender + ", Full Time Employee: " + fullTimeEmployee);
	}
	
	// Here parameters are different in name, no issue, see line 61
	public Employee(String employeeName, int id) {
		this.empName = employeeName;
		this.empId = id;
		System.out.println("\tEmployee ID: " + id + "\n\tEmployee Name: " + employeeName);
		
	}
	
	
	
	
	
	

}
