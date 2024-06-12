package lec12_02_string_manipulation;

public class DifferentMethodsOfString {

	public static void main(String[] args) {
		// If we write a String by creating an object, we have write like below	
		String a = new String("Good Evening!");
		System.out.println(a);
		
		System.out.println("------------------------------------------------------------------------");
		// The below is how we represent String as variable
		String s = "Lorem ipsum dolor sit amet consectetur adipisicing dolor elit. Voluptas maiores nemo modi! Alias pariatur nulla?";
		
		// The Java String class length() method finds the length of a string.(important)
		System.out.println(s);
		System.out.println("The length of the String is: " + s.length());
		
		// The java string toUpperCase() method returns the string in upper case letter.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println(s.toUpperCase());
		System.out.println(s); // String is Immutable [unchangeable] that's why it's value is not changed
		// This is a very very important interview question
		
		// The java string toLowerCase() method returns the string in lower case letter.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println(s.toLowerCase());
		
		s = "Lorem ipsum dolor sit amet consectetur adipisicing dolor elit. Voluptas maiores nemo modi! Alias pariatur nulla?";
		
		// charAt() -- Returns the char value at the specified index.
		// The index number starts from 0 and goes to n-1, where n is the length of the string. 
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("\nThe character at a specific position(0): " + s.charAt(0));
		System.out.println("\nThe character at a specific position(10): " + s.charAt(10));
		System.out.println("\nThe character at a specific position(100): " + s.charAt(100));
		System.out.println("\nThe character at a specific position(111): " + s.charAt(111));
		// System.out.println("\nThe character at a specific position(111): " + s.charAt(112));
		// will show "StringIndexOutOfBoundsException"
		
		// The Java String class indexOf() method returns the position of the first occurrence of the specified character or string in a specified string.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("\nThe character 'L' is, at the position of: " + s.indexOf('L')); // String indexing starts from 0
		System.out.println("\nThe character 'V' is, at the position of: " + s.indexOf('V')); 
		System.out.println("\nThe character 'l' is, at the position of: " + s.indexOf('l')); // case sensitive, 
		System.out.println("\nThe character 'r' is, at the position of: " + s.indexOf('r')); // if present more than one, the first own is recognized
		System.out.println("\nThe character 'x' is, at the position of: " + s.indexOf('x')); // if any character is absent, it shows -1.

		s = "Lorem ipsum dolor sit amet consectetur adipisicing dolor elit. Voluptas maiores nemo modi! Alias pariatur nulla?";
		
		// Returns the index within this string of the first occurrence of the specified substring.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("\nThe index of 'dolor' word is in : " + s.indexOf("dolor"));
		System.out.println("\nThe index of 'Dolor' word is in : " + s.indexOf("Dolor")); // case sensitive
		System.out.println("\nThe index of 'debitis' word is in : " + s.indexOf("Voluptas maiores nemo")); 
		System.out.println("\nThe index of 'pariatur' word is in : " + s.indexOf("pariatur nulla?"));
		
		// last occurrence of a character by lastIndexOf() (important interview question)
		// The Java String class lastIndexOf() method returns the last index of the given character value or substring.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("\nThe first 'r' character is - at the position of: " + s.indexOf('r')); 
		System.out.println("\nThe last 'r' character is - at the position of: " + s.lastIndexOf('r')); 
		
		System.out.println("\n----------------------------------- Tough 1 -------------------------------------");
		// To know the position of the repetitive character in which index we follow
		// below formula:
		// s.indexOf('a', s.indexOf('a')+1)) [interview]
		// First occurrence
		System.out.println("The first 'r' character is - at the position of: " + s.indexOf('r'));
		// Second occurrence, Interview question
		System.out.println("The second 'r' character is - at the position of: " + s.indexOf('r', s.indexOf('r')+1));
		// Third occurrence
		System.out.println("The third 'r' character is - at the position of: " + s.indexOf('r', s.indexOf('r', s.indexOf('r')+2)+1));
		
		
		s = "Lorem ipsum dolor sit amet consectetur adipisicing dolor elit. Voluptas tempora ebitis maiores nemo modi! Alias pariatur nulla?";
		// The java string substring() method returns a part of the string. needed for framework
		// this substring is important method
		// Returns a string that is a substring of the original string. The substring begins at the specified beginIndex and 
		// extends to the character at index (endIndex - 1). Please remember it, here upper limit is excluded
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println(s.substring(51)); // begin index 51, last index = end index -1
		System.out.println(s.substring(51, 71)); // begin index 51, last index = end index -1
		
		// equals() method is used to compare Strings and return a boolean value, needed for framework
		// Returns 'true' if the given object represents a String equivalent to this string, 'false' otherwise
		System.out.println("\n------------------------------------------------------------------------");
		String s1 = "My name is John. ";
		String s2 = "My name is John. ";
		String s3 = "my name is john. ";
		String s4 = "MY NAME IS JOHN. ";
		
		System.out.println("Is s1 equal to s2? Ans: " + s1.equals(s2));
		System.out.println("Is s1 equal to s3? Ans: " + s1.equals(s3));
		System.out.println("Is s1 equal to s4? Ans: " + s1.equals(s4));
		System.out.println("Is s3 equal to s4? Ans: " + s3.equals(s4));
		
		System.out.println("\n------------------------------------------------------------------------");
		// == is used in int, int can't use equal()
		int i = 20;
		int j = 20;
		int k = 25;
		System.out.println(i==j);
		System.out.println(i==k);
		System.out.println(j==k);
		// equals() is not used for int type, used for String Type only
		
		// How about String
		// We can also use == equal to ---> to compare 2 string, but need to be careful for line 113
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println(s1==s2);
		System.out.println("Is it True? Ans: " + s1==s2); 
		// Why false? get it? because "xxxxxxx" + s1 ----> is concatenating and then comparing with s2
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		
		s1 = "My name is John. ";
		s2 = "My name is John. ";
		s3 = "my name is john. ";
		s4 = "MY NAME IS JOHN. ";
		
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println(s3.equals(s4)); // how we can solve that issue? one way below -
		// Using 2 String methods together. first convert them to upper or lower case, then compare
		System.out.println(s3.toUpperCase().equals(s4));
		System.out.println(s4.toLowerCase().equals(s3));
		
		System.out.println("\n------------------------------------------------------------------------");
		String s5 = "my Name is John. ";
		String s6 = "MY name IS JOHN. "; // here, name is not Upper case
		System.out.println(s5.toUpperCase().equals(s6)); // false
		System.out.println(s5.toUpperCase().equals(s6.toUpperCase()));
		System.out.println(s5.toLowerCase().equals(s6.toLowerCase()));
		
		s3 = "my Name is John. ";
		s4 = "MY NAME is JOHN. ";
		// Two strings are considered equal ignoring case if they are of the same length
		// and corresponding characters in the two strings are equal ignoring case.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println(s3.equals(s4)); // how that can be solved? one way below -
		System.out.println(s3.equalsIgnoreCase(s4)); // Important: needed for framework
		
		// Interview Question
		// The java string trim() method eliminates leading and trailing spaces. (interview question)
		// To avoid white space: trim() us used -- (it remove any leading and trailing whitespace)
		System.out.println("\n------------------------------------------------------------------------");
		String s7 = "         HelloWorld.        ";
		System.out.println("Before Trim: " + s7);
		System.out.println("After Trim: " + s7.trim());
		
		// can't remove white space Between Words
		System.out.println("\n------------------------------------------------------------------------");
		String s8 = "    Hello       World!    ";
		System.out.println("Before Trim: " + s8);
		System.out.println("After Trim: " + s8.trim()); // Please see solution at line 186
		
		// The java string replace() method returns a string replacing all the old char or CharSequence to new char or CharSequence.
		// To replace we use replace() method
		// Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.
		// interview question
		System.out.println("\n------------------------------------------------------------------------");
		String s9 = "Good morning ma";
		System.out.println("Before replace: " + s9);
		System.out.println("After replacing by Character: " + s9.replace('m', 'M'));
		// Issue is, it will change the specific character everywhere
		System.out.println("After replacing by Character: " + s9.replace("ma", "Mom"));
		
		// replace() can't trim
		System.out.println("\n------------------------------------------------------------------------");
		String s10 = "      GooD    MoRning      ";
		System.out.println("Replacing can't move white space: " + s10.replace('D', 'd'));
		// We can use trim() and replace() together
		System.out.println("After triming and replacing: " + s10.trim().replace("D    MoRning", "d Morning"));
		
		System.out.println("\n------------------------------------------------------------------------");
		String s11 = "      Good    MoRning      ";
		System.out.println("Before replacing: " + s11);
		System.out.println("After replacing: " + s11.replaceAll("      Good    MoRning      ", "Good Morning"));
		System.out.println("After replacing: " + s11.replaceAll("      Good    MoRning      ", "Good Evening"));

		s8 = "    Hello       World.    ";
		System.out.println("After triming and replacing: " + s8.trim().replace("       ", " "));
		// or
		System.out.println("After triming and replacing: " + s8.trim().replace("       World.", " World!"));
		// or
		System.out.println("After replacing all: " + s8.replaceAll("    Hello       World.    ", "Hello World!"));
		
		// Other 3 examples of replaceAll()
		System.out.println("\n------------------------------------------------------------------------");
		String s12 = "Hello! Let's learn together";
		System.out.println("After replacing a word: " + s12.replace("Hello!", "Welcome to Java."));
		
		System.out.println("\n------------------------------------------------------------------------");
		String dateOfToday = "10/01/2023"; // very much used
		System.out.println("After replacing: " + dateOfToday.replace('/', '-'));
		
		s12 = "Hello! Let's learn together";
		// The java string replaceAll() method returns a string replacing all the
		// sequence of characters matching regex and replacement string.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("Before replacing all: " + s12);
		System.out.println("After replacing all, the complete String is: " + s12.replaceAll(s12, "Hey Hey Captain!"));
		
		// regular way of concatenation
		
		
}

}
