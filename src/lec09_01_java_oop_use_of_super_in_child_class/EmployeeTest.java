package lec09_01_java_oop_use_of_super_in_child_class;

public class EmployeeTest {

	public static void main(String[] args) {
		System.out.println("\n---------- default constructor initialized from The Child Class Employee -----------");
		Employee employee = new Employee();
		
		System.out.println("\n---------- parametrized constructor initialized from The Child Class Employee -----------");
		Employee employee2 = new Employee("Alex F", 21893, 'M', false);
		
		System.out.println("\n---------- void type method initialized from The Child Class Employee -----------");
		employee2.empInfo();
		
		System.out.println("\n---------- parameterized method initialized from The Child Class Employee -----------");
		employee2.employeeInfo("Julie Amstrong", 59853, 'F', true);
		
		System.out.println("\n---------- default constructor initialized from The Parent Class Mount Sinai -----------");
		MountSinai mountSinai = new MountSinai();
		
		System.out.println("\n---------- parameterized constructor initialized from The Parent Class Mount Sinai -----------");
		MountSinai mountSinai2 = new MountSinai("Manhattan", 4);
		
		System.out.println("\n---------- void type method initialized from The Parent Class Mount Sinai -----------");
		mountSinai2.msInfo();
		
		System.out.println("\n---------- parameterized method initialized from The Parent Class Mount Sinai -----------");
		mountSinai2.mountSinaiInfo("Queens", 3);
		
		
		
		
		

	}

}
