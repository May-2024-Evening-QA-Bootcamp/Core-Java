package lec21_coding_challenge;

// Que: How many 'z/Z'  inside the provided String? They like to confuse you by not saying upper or lower case
// you have to ask -- is it upper case or lower case?
// Better not to ask if they don't define 

public class B01_countASpecificCharacter {
	public static void countASpecificCharacter(String s) {
		int count = 0;
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i)=='Z' || s.charAt(i)=='z') {
				count ++;
			}
		}
		System.out.println(count);
	}
	
	
	public static void main(String[] args) {
		countASpecificCharacter("ZiyadZ Alz KhilanliezZZZ");
	}

}
