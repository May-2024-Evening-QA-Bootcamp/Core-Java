package lec21_coding_challenge;

// Que: Write a method to find the number of vowels from the String? Vowel: a, e, i, o, u

public class C01_countVowel {
	public static void countVowel(String s) {
		// here the whole String converted to lower case
		s = s.toLowerCase();
		s = s.replaceAll("\\s", "");
		int count = 0;
		for (int i = 0; i<s.length(); i++) {
			if(s.charAt(i)=='a' || s.charAt(i) =='e' || s.charAt(i) =='i' || s.charAt(i) == 'o' || s.charAt(i) =='u') {
				// count++;
				// count = count + 1;
				count +=1;				
			}			
		}
		System.out.println("Number of vowel: " + count);
	}

	public static void main(String[] args) {
		countVowel("Pack my box with five dozen liquor jugs");

	}

}

// in logical or (||)operator: if one condition is true, then the whole condition is true
// in logical and (&&) operator: if all condition is true, then the whole condition is true
