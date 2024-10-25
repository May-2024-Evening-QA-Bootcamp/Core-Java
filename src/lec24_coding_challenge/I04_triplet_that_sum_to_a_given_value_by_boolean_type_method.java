package lec24_coding_challenge;

/*   Find a triplet that sum to a given value (Sazzad)

Input: A[] = {1, 4, 45, 6, 10, 8 }, sum = 22; 
Output: ?
					
					1          4         45         6        10         8
										
*/

public class I04_triplet_that_sum_to_a_given_value_by_boolean_type_method {

	static int [] array = { 6, 4, 5, 45, 1, 10, 8, 7, 9, 12};
	static int sum = 22;
	static int size = array.length;

	//  follow I03

	public static boolean findThreeNumber(int [] array, int size, int sum) {
		int count = 0;
		// Fix the first element as A[i]
		for (int i = 0; i < size - 2; i++) {

			// Fix the second element as A[j]
			for (int j = i + 1; j < size - 1; j++) {

				// Now look for the third number
				for (int k = j + 1; k < size; k++) {
					if (array[i] + array[j] + array[k] == sum) {
						System.out.print("Triplets are:::> " + array[i] + ", " + array[j] + ", " + array[k]+"\n");
						count++;
						System.out.println("Incident Happen: " + count + " time");
						
					}
				}
			}
		}
		// If we reach here, then no triplet was found
		return false;
	}

	// Driver program to test above functions
	public static void main(String[] args) {
		findThreeNumber(array, size, sum);
	}


}
