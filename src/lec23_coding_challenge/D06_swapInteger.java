package lec23_coding_challenge;

public class D06_swapInteger {
	public static void main(String[] args) {
		int x = 8;
		int y = 4;
		System.out.println("The valus of x is: " + x);
		System.out.println("The valus of y is: " + y);

		// using arithmetic operator
		x = x * y;
		y = x / y;
		x = x / y;

		System.out.println("-----------------");
		System.out.println("After swap, The valus of x is: " + x);
		System.out.println("After swap, The valus of y is: " + y);

	}

}
