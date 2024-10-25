package lec24_coding_challenge;

/*   
Find a triplet that sum to a given value (Sazzad)

Input: A[] = {1, 4, 45, 6, 10, 8 }, sum = 22; 
Output: ?
					
					1          4         45         6        10         8
										
*/

public class I03_triplet_that_sum_to_a_given_value_by_int_type_method {
	
	static int [] array = {6, 4, 5, 45, 1, 10, 8, 7, 9, 12};
	static int sum = 22;
	static int size = array.length;
	
	public static int findThreeNumber(int[] array, int size, int sum) {
		int count = 0;
		for(int i = 0; i<size-2; i++) { //6
			
			for (int j = i+1; j<size-1; j++) { //4
				
				for (int k= j+1; k<size; k++) { // 5, 45, 1, 10, 8, 7, 9, 12
					if(array[i]+array[j]+array[k]==sum) {
						System.out.print("Triplets are:::> " + array[i] + ", " + array[j] + ", " + array[k] + "\n");
						count++;
					}
					
				}
				
			}
			
		}
		System.out.println("Incident Happen: " + count);
		return count;
	}

	public static void main(String[] args) {
		findThreeNumber(array, size, sum);

	}

}
