package lec04_02_java_constructor_final;

public class EmployeeTest {

	public static void main(String[] args) {
		// default Constructor Initialized
		Employee employee = new Employee();
		
		// parameterized constructor initialized
		System.out.println("------------------------------------------------");
		Employee shahnaz = new Employee("Shahnaz", 21450, 'F', false);
		Employee aysha = new Employee("Aysha k", 68422, 'F', true);
		Employee roni = new Employee("Roni k", 98377, 'M', true);
		Employee alex = new Employee("Alex F", 21450, 'M', false);
		Employee elena = new Employee("Elena C", 23272, 'F', true);
		Employee reegan = new Employee("Reegan", 63547, 'M', true);
		
		// Advantage of Parameterized Constructor: 
		// We can initialized arguments for multiple people
		
		
		
	}

}
