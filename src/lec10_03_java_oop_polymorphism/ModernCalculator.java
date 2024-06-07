package lec10_03_java_oop_polymorphism;

// child class can override the method of parent class
public class ModernCalculator extends LandCalculator {
	
	// void type non parameterized method (1) is implemented
	@Override
	public void landCalculator() {
		System.out.println("This is void type method from Modern Calculator");
		System.out.println("Method name is same from the parent, but syntax or logic is changed in the method body");
	}

	// void type parameterized method (2) implemented
	@Override
	public void landCalculator (int a, int b) {
		int total1 = a + b/2 +100 ;
		System.out.println("Total area from Land Calculator: " + total1);
	}

	// void type parameterized method (3) implemented
	@Override
	public void landCalculator(int a, int b, int c) {
		int total2 = a/2 + b/3 + c/2; // here total2 is local variable
		System.out.println("Total area from Land Calculator: " + total2);
	}

	// void type parameterized method (4) implemented
	@Override
	public void landCalculator(int d, String e, int f) {
		int total3 = d/3 + Integer.parseInt(e) + f + 5;
		System.out.println("Total area from Land Calculator: " + total3);
	}

	// return type parameterized method (5) implemented
	@Override
	public int landCalculator(float d, String e, int f) {
		int total4 = (int) d + Integer.parseInt(e) + f/5 + 800;
		System.out.println("Total area from Land Calculator: " + total4);
		return total4;
	}

	// Return type parameterized method which is final and implemented
	// Final type method cannot be Overriden -- important interview question
	// Cannot override the final method from LandCalculator, Why?
	// final keyword doesn't allow any change in method, variable, class
		
	/*
	@Override
	public final int landCalculator(int a, int b, int c, int d) {
		int total5 = a + b + c + d;
		System.out.println("Total area from Modern Calculator: " + total5);
		return total5;
	}
	*/
		

	// Static type Method (7) implemented
	// important interview question
	// This below method - landCalculator can't override or implemented
	// because static is a local member method of a class
	// So, static method can't be override, if we remove @override it will work as
	// it is considered as the static method of this modern calculator class
	
	/*
	@Override
	public static void landCalculator(int a, int b, int c, int d, int e) {
		int total6 = a + b + c + d + e; // local variable
		System.out.println("Total area from Land Calculator: " + total6);
	}
	 */
}
