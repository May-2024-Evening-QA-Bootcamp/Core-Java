package lec24_coding_challenge;

import java.util.Arrays;

// very common interview question: sort this string (Sana Naeem)
// sort? either ascending or descending? Ans:asceding [first number, then upper case, then lower case]

public class E05_sort_the_string_with_coma_separated_character {

	public static void main(String[] args) {
		// Custom string input
		String s = "yakbz  5o27leux4w Rq9LAc3KMBm80   hjgjhjhj67786";
		// We remove the white space by below line
		// where \s is a single space in unicode
		s = s.replaceAll("\\s", ""); //  if no white space, no need of this line , do java comments and see
		// System.out.println(s); // to see space is removed
		// How to Convert a string into character Array, see line 17
		// why we use Array? can we work with String? we did by s.charAt(), but when we go to swap it doesn't allow us 
		char [] arr = s.toCharArray();
		System.out.println("Before Sort: " + Arrays.toString(arr)); // we printed to see, the array is created with character, [not needed]
		
		char temp;
		for(int i = 0; i<arr.length; i++ ) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr [j];
					arr[j] = temp;					
				}
			}
		}
		// By now loop is done means we have iterated the whole array
		System.out.println("After Sort: " + Arrays.toString(arr));
		
	}

}
