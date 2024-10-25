package lec24_coding_challenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// This code is correct, so I am showing how?
public class E07_findCharactersWhichPresentMoreThanOneInsideAString {

	public static void main(String[] args) {
		String s = "Every person had a star, every star had a friend, and for every person carrying a star there was someone else who reflected it, and everyone carried this reflection like a secret confidante in the heart?&^%^&%&%&&%&_)(*&^%$$##@@!!~";
		s = s.replaceAll("\\s", ""); // remove whitespace
		s = s.replaceAll(",", ""); // remove comma
		s = s.replaceAll("[^a-z, A-Z, 0-9]", ""); // remove special character
		s = s.toLowerCase();
				
		char [] arr = s.toCharArray();
		// System.out.println(Arrays.toString(arr));

		Set<Character> moreThanOne = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					moreThanOne.add(arr[i]);
				}

			}
		}
		System.out.println("String present more than one are: " + moreThanOne);
	}

}
