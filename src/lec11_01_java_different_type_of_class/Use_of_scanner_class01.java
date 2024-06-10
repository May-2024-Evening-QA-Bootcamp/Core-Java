package lec11_01_java_different_type_of_class;

import java.util.Scanner;

public class Use_of_scanner_class01 {

	public static void main(String[] args) {
		System.out.println("Please Enter your age here: ");
		// How Scanner class is instantiated here? by passing System.in as argument
		// System is a class, 'in' is a (input) properties
		// this Scanner class allow us to write in the console
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		// nextInt() method --> Reads an int value from the user
		System.out.println("Your Age is: " + age);
		scanner.close();
	}

}
