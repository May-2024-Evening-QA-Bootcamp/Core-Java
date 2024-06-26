package lec16_01_Java_Nested_Class;

// Outer class
public class JFK1 {  // Opening of the outer class body
	// To get access of the inner class properties, Inner class must be Instantiated [creating object] inside outer Class
	TerminalOne t1 = new TerminalOne();
	TerminalTwo t2 = new TerminalTwo();
	TerminalFour t4 = new TerminalFour();	
	
	// method of the Outer class
	public void welcome() {
		System.out.println("Welcome to JFK Airport");
	}
	
	// First Inner Class
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

	// Third inner class
	public class TerminalFour {
		public void middleEasternFlights() {
			System.out.println("Terminal Four is for Emirates International");
		}
	}
	
}  // Closing of the outer class body
