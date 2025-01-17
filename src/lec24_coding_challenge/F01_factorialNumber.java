package lec24_coding_challenge;

/*
 7! = 7x6x5x4x3x2x1
 5! = 5x4x3x2x1
 4! = 4x3x2x1
 
 Two information below:
 1! = 1
 0! = 1  [Exception]

Factorial number can't be negative

Explanation:

5! = 5 x 4 x 3 x 2 x 1
	= 5 x (5-1) x (5-2) x (5-3) x (5-4)
	= 5 x (5-1) x (5-2) x (5-3) x (5-(5-1))
	
n! = n x (n-1) x (n-2) x (n-3) x (n-(n-1))

n! = n(n-1)(n-2)(n-3) ...................... (n-(n-1))
 
FYI: Why 0! = 1? not necessary to know about it for us.
Factorial of a number in mathematics is the product of all the positive numbers less than or equal to a number.
But there are no positive values less than zero so the data set cannot be arranged which counts as the possible
combination of how data can be arranged (it cannot). Thus, 0! = 1. 

 */

public class F01_factorialNumber {
	
	// 1st way: doing by recursive method
	// This is a recursive method, it means method is called inside the same method
	public static int recFactorial(int n) {
		if(n==0) {
			return 1;
		} else {
			return n * recFactorial(n-1);
		}
	}
	
	// 2nd way: Doing by for loop
	// 6x5x4x3x2x1
	// 1x2x3x4x5x6
	public static int factorial(int m) {
		int total = m;
		for (int i = m - 1; i >= 1; i--) {
			total = total * i;
		}

		return total;
	}

	public static void main(String[] args) {
		System.out.println(recFactorial(5));
		System.out.println(factorial(6)); 

	}

}
