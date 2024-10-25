package lec24_coding_challenge;

public class H05_PlayWithString {
	public static void main(String[] args) {
		String s = "Java Java";
		s.replace('a', '@');
		System.out.println(s); // This is the question
		System.out.println(s.replace('a', '@'));
		System.out.println(s.replaceAll(s, "We wanna know"));
		System.out.println(s);
		// Main clue: String is immutable
	}

}
