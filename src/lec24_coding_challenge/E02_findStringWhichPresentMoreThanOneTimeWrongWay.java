package lec24_coding_challenge;

// This code is incorrect, so I am showing how?
public class E02_findStringWhichPresentMoreThanOneTimeWrongWay {
	// also count how many times?
	public static void main(String[] args) {
		// Here language is an String type Array.
		String[] language = { "Java", "C++", "C#", "Python", "Java", "C++", "Java", "Python", "Javascript", "C++" };
		
		for(int i = 0; i<language.length; i++) {  // index 0 is "Java"
			for(int j = i+1; j<language.length; j++) { // "C++", "C#", "Python", "Java", "C++", "Java", "Python", "Javascript", "C++"
				if(language[i].equals(language[j])) {
					System.out.println(language[i]);
				}
			}
		}
	}
}
