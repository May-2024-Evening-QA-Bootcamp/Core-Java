package lec21_coding_challenge;

// Que: Write a method to find the number of consonants from the String? 

public class C02_consonant {
	public static void countVowel(String s) {
		s = s.toLowerCase();
		// s = s.replaceAll(" ", "");  // below line is more smarter
		s = s.replaceAll("\\s", "");
		// replacing all white space [\\s stands for “whitespace character”]
		int count = 0;
		for (int i = 0; i<s.length(); i++) {
			if(s.charAt(i)!='a' && s.charAt(i) !='e' && s.charAt(i) !='i' && s.charAt(i) != 'o' && s.charAt(i) !='u') {
				count +=1;				
			}			
		}
		System.out.println("Number of consonant: " + count);
	}

	public static void main(String[] args) {
		countVowel("Pack my box with five dozen liquor jugs");

	}

}

// in logical or (||)operator: if one condition is true, then the whole condition is true
// in logical and (&&) operator: if all condition is true, then the whole condition is true
