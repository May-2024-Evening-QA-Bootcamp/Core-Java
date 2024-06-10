package lec11_01_java_different_type_of_class;

import java.util.Scanner;

// Can we use nextInt() and nextLine() together? Yes

public class Use_of_scanner_class05 {

	public static void main(String[] args) {
		System.out.println("Please Input Your Name");
		Scanner scanner = new Scanner(System.in);
		// if we want to input String, int, float together, that is OK!
		String name = scanner.nextLine(); // String Type
		
		System.out.println("Please Input Your score");
		int hw = scanner.nextInt(); // Int type
		int quiz = scanner.nextInt();
		int exam = scanner.nextInt();

		int sum = hw + quiz + exam;
		System.out.println("Hi " + name + "! The sum of the hw, quiz and exam is: " + sum);
		scanner.close();
	}

}
