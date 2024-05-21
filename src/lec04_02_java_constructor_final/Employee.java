package lec04_02_java_constructor_final;

public class Employee {
	public String empName;
	public int empId;
	public char empGender;
	public boolean fullTimeEmployee;
		
	// default Constructor is declared/defined
	public Employee () {
		System.out.println("I am a Constructor from Employee Class");
	}

	// Parameterized constructor declared
	public Employee(String empName, int empId, char empGender, boolean fullTimeEmployee) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empGender = empGender;
		this.fullTimeEmployee = fullTimeEmployee;
		System.out.println("Employee Name: " + empName + ", Employee ID: " + empId + 
				", Employee Gender: " + empGender + ", Full Time Employee: " + fullTimeEmployee);
	}

	
	
	
	
	

}
