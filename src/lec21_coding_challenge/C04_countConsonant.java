package lec21_coding_challenge;

//Que: Write a method to find the number of vowels from the String? Vowel: a, e, i, o, u

public class C04_countConsonant {
	public static void countConsonant(String s) {
		s = s.toLowerCase(); 
		// This is the change, added in the condition
		// s = s.replaceAll("\\s", "");
		int count = 0;
		
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u' && s.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println("Number of Consonant: " + count);
	}
	
	public static void main(String[] args) {
		countConsonant("Pack my box with five dozen liquor jugs");
	}

}