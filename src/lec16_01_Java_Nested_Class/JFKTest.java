package lec16_01_Java_Nested_Class;

public class JFKTest {

	public static void main(String[] args) {
		JFK1 jfk1 = new JFK1();
		jfk1.welcome();// outer class method is initialized
		// The below method doesn't work
		// jfk1.destination(); // destination() is Inner class method
		
		// Below line is not ok, because TrminalOne is an inner class, inner class can't be instantiated here
		// Creating object from inner class is not possible here
		// TerminalOne t1 = new TerminalOne();
		
		// Below one is not ok as Terminal one is not static
		// JFK1.TerminalOne jt01 = new JFK1.TerminalOne();
		
		// How an outer class object will access the properties/methods of inner class?
		// object of outer class dot object of inner class dot properties/methods of the inner class
		jfk1.t1.destination();
		jfk1.t2.domestic();
		jfk1.t4.middleEasternFlights();
		
		System.out.println("\n-------------- JFK02 --------------");
		JFK2 jfk2 = new JFK2();
		jfk2.welcome();
		
		
		JFK2.TerminalFour jt04 = new JFK2.TerminalFour();
		jt04.middleEasternFlights();
		// jt04.asianFlights(); // shows warning because static method need to be called by the class, SEE below
		
		System.out.println("\n----------------------------");
		// static method of static inner class
		JFK2.TerminalFour.asianFlights(); // This is new here
		// If outer class have static inner class, and static inner class have static method
		// you don't need to create object like line 31

	}

}
