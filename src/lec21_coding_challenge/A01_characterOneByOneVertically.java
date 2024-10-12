package lec21_coding_challenge;
/*
Que: Print out your name vertically [They will not mention: character by character]
Input: Tofael Kabir
Output:
T
o
f
a
e
l

K
a
b
i
r
*/

public class A01_characterOneByOneVertically {
	
	public static void nameInVertical(String s) {
		for(int i = 0; i<s.length(); i++) {		
			System.out.println(s.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		nameInVertical("Tofael Kabir");
		System.out.println("--------------");
		nameInVertical("Joseph Momoa");

	}

}










