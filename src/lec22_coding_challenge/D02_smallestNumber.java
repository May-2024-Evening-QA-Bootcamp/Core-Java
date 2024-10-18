package lec22_coding_challenge;

public class D02_smallestNumber {

	public static void smallest() {
		int[] number = { 2, 12, 1, 0, 100, 4, 9, 3 };

		int smallest = number[0]; // we assume zero index is smallest
		// Then start comparing it with index one, then two, then three ........

		for (int i = 1; i < number.length; i++) {
			if (number[i] < smallest) {
				smallest = number[i];
			}
		}
		System.out.println(smallest);
	}

	public static void main(String[] args) {
		smallest();
	}

}
