package lec05_03_java_basic_interview_question;

// Inside main method, the variables are non static and default type

public class Employee3 {
	// static is a local member method of this class
	public static void main(String[] args) {
		// local variable
		// they should be default type
		String  empName = "Mohammad Sharkar";
		int empId = 2188458;
		char gender = 'M';
		boolean fullTimeEmployee = false;
		System.out.println("Employee Name: " + empName + ", Employee Id: " + empId + ", Employee Gender: " + gender
				+ " and Full time Employee? Ans: " + fullTimeEmployee);

	}

}
