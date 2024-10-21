package lec23_coding_challenge;

public class D03_find_the_largest_and_the_smallest_Number {
	public static void smallestAndLargest() {
		int[] number = { 2, 12, 1, 0, 100, 4, 9, 3 };

		int smallest = number[0];
		int largest = number[0];

		for (int i = 1; i < number.length; i++) {
			if (number[i] < smallest) {
				smallest = number[i];
			} else if (number[i] > largest) {
				largest = number[i];
			}
		}
		System.out.println("Smallest Number: " + smallest);
		System.out.println("Largest Number: " + largest);
	}
	
	public static void main(String[] args) {
		smallestAndLargest();
	}
	

}
