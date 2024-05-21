package lec04_01_java_constructor;

public class EmployeeTest {

	public static void main(String[] args) {
		// When class is instantiated, means when object is created, Constructor is Initialized
		// default Constructor Initialized
		Employee employee = new Employee();
		
		System.out.println("------------------------------------------------");
		// Here "Alex F" is called 'argument' which is String type
		// Here 21450 is called 'argument' which is int type
		// Here 'M' is called 'argument' which is char type
		// Here false is called 'argument' which is boolean type 
		// Parameterized Constructor have advantage, you can reuse it, how?
		// we change arguments
		Employee shahnaz = new Employee("Shahnaz", 21450, 'F', false);
		
		System.out.println("------------------------------------------------");
		Employee aysha = new Employee("Aysha k", 68422, 'F', true);
		
		System.out.println("------------------------------------------------");
		Employee roni = new Employee("Roni k", 98377, 'M', true);
		
		System.out.println("------------------------------------------------");
		Employee reegan = new Employee(76822, 'M', "Reegan", false);
		// The sequence of argument should be same as parameter inside the parameterized constructor
		// But before we should send same number of parameter
		
		System.out.println("------------------------------------------------");
		// Parameterized Constructor initialized -
		Employee johnson = new Employee("Johnson B", 63547, 'M');
		
		System.out.println("------------------------------------------------");
		// Parameterized Constructor initialized -
		Employee tofael = new Employee("Tofael", 2188458);
		
	}

}
