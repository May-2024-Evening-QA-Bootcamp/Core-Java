package lec24_coding_challenge;

public class D01_largestNumber {

	public static void largest() {
		int[] number = { 2, 12, 1, 0, 100, 4, 9, 3 };

		int largest = number[0]; // we assume zero index is largest
		// Then start comparing it with index one, then two, then three ........

		for (int i = 1; i < number.length; i++) {
			if (number[i] > largest) {
				largest = number[i];
			}
		}
		System.out.println(largest);
	}

	public static void main(String[] args) {
		largest();
	}

}
