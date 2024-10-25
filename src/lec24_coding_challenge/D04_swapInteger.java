package lec24_coding_challenge;

public class D04_swapInteger {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		
		System.out.println("The valus of x is: " + x);
		System.out.println("The valus of y is: " + y);
		
		// using temporary variable
		int temp;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("-----------------");
		System.out.println("After swap, The valus of x is: " + x);
		System.out.println("After swap, The valus of y is: " + y);

	}

}
