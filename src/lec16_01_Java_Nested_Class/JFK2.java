package lec16_01_Java_Nested_Class;

// Outer class
public class JFK2 {  // Opening of the outer class body
	// To get access of the inner class properties, Inner class must be Instantiated [creating object] inside outer Class
	TerminalOne t1 = new TerminalOne();
	TerminalTwo t2 = new TerminalTwo();
	TerminalFour t4 = new TerminalFour();	
	
	// Here is the change
	// method of the Outer class
	public void welcome() {
		t1.destination();
		t2.domestic();
		t4.middleEasternFlights();
		// t4.asianFlights(); // shows warning because static method
		// Here is the change
		// static method from TerminalFour
		TerminalFour.asianFlights();
	}
	
	// First Inner Class/Nested class
	// How many inner class we can create? Ans: As many as you want
	public class TerminalOne{  // Opening of the inner class body		
		// method of the inner class
		public void destination() {
			System.out.println("Terminal One is for Saudi Airlines");
		}	
	}  // Closing of the inner class body
	
	// Second inner class
	public class TerminalTwo {
		public void domestic() {
				System.out.println("Terminal two is for Delta International");
		}
	}
	// Here is the change
	// Class can be static too, if it is inner, so it is a local class of the outer class
	// Third inner class
	public static class TerminalFour {
		// non static method of the static inner class
		public void middleEasternFlights() {
			System.out.println("Terminal Four is for Emirates International");
		}
		
		// static method of the static inner class
		public static void asianFlights() {
			System.out.println("Terminal four is also for Thai International");
		}
	}
	
}  // Closing of the outer class body
