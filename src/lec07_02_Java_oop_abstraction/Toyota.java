package lec07_02_Java_oop_abstraction;

// A regular class
public class Toyota {
	
	// Constructor is declared inside Class
	public Toyota() {
		System.out.println("This constructor is from Toyota class");
	}
	
	// method implemented inside a class, but not declared or defined
	// This is a very very important interview question
	// called non abstract method or implemented method
	public void toyota() {
		System.out.println("This method is from Toyota Class");
	}

}
