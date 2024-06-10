package lec11_01_java_different_type_of_class;

import java.util.Scanner;

public class Use_of_scanner_class04 {

	public static void main(String[] args) {
		System.out.println("Please Input score accordingly");
		Scanner scanner = new Scanner(System.in);
		float scoreInHW = scanner.nextFloat();
		float scoreInQuiz = scanner.nextFloat(); // you learn from here

		float averageScore = (scoreInHW + scoreInQuiz) / 2;
		// no need to use f in the console, because float type use f at the Editor.
		System.out.println("\nThe Average Score of mine in this course is: " + averageScore);
		scanner.close();
	}

}
