package lec23_coding_challenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// This code is correct, so I am showing how?
public class E06_findWordsWhichPresentMoreThanOneInsideAString {

	public static void main(String[] args) {
		String s = "Every person had a star, every star had a friend, and for every person carrying a star there was someone else who reflected it, and everyone carried this reflection like a secret confidante in the heart.";
		
		s = s.toLowerCase();
		
		String[] arr = s.split(" ");

		Set<String> moreThanOne = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					moreThanOne.add(arr[i]);
				}

			}
		}
		System.out.println("String present more than one are: " + moreThanOne);
	}

}
