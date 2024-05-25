package lec06_02_java_type_casting;

public class UseOfNarrowingCasting {

	public static void main(String[] args) {
		double myGrade = 3.568735;
		System.out.println("My grade in double: " + myGrade);
		
		// How can you convert a double to an int type?
		// By Narrowing casting
		
		int myNewGradeInInt = (int)myGrade;
		System.out.println("My new Grade in int: " + myNewGradeInInt);
		
		// How can you convert a double to a byte type?
		byte myNewGradeInByte = (byte)myGrade;
		System.out.println("My new Grade in byte: " + myNewGradeInByte);

	}

}

// Convert from  float, double to byte or short or int or long
// we use Narrowing casting by adding data type manually
