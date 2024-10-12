package lec21_coding_challenge;

// Que: How many 'z/Z'  inside the provided String? They like to confuse you by not saying upper or lower case
// you have to ask -- is it upper case or lower case?
// Better not to ask if they don't define 

public class B02_countASpecificCharacter {
	public static void countASpecificCharacter(String s) {
		int count = 0;
		s = s.toLowerCase(); // or you can convert to Uppper case and look for upper case Z
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i)=='z') {
				count++;
			}
		}
		System.out.println(count);
	}
	
	
	public static void main(String[] args) {
		countASpecificCharacter("ZiyadZ Alz KhilanliezZZZ");
	}

}

// B02 is more faster execute
