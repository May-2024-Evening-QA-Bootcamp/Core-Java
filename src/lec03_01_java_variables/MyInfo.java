package lec03_01_java_variables;

public class MyInfo {
	// variables initialized
	// String is Not a pure primitive data type
	public String myName = "Tofael";
	
	// primitive data type - 8 type
	// byte, short, int, long are used for complete/solid number
	public byte myAge = 127;
	public short myApartmentRent = 32767;	
	public int myYearlySalary = 354725363;
	public long myBankBalance = -7642537923547l;
	// we must have to use lower case L (l), at the end of long type value
	// Long can accept int range and no need of l, but when you cross the range of int, you must have to use l, example: 2147483648
		
	// float and double are used for not a complete number [a number with decimal]
	public float myHeight = 1.645453f;
	// we must have to use lower case f, at the end of float value
	public double myGrade = 3.57436574865;
	// Above 6 types are used for number, values are represented with no quotation
	// Important: Mostly int is used for complete number and float for decimal number
		
	public char myGender = 'M';
	public boolean usCitizen = true;
	
	// Constructor declared
	public MyInfo() {
		System.out.println("This is all About Me");
	}
	
	// How to create a method?
	// This is a void type method
	// method name generally starts with lower Case 
	// and follow camel case feature or snake case pattern
	// method name is in lower case
	// but, this is not mandatory to make a method name same as class name
	// method always implemented inside class, important info
	// method never declared inside class	
	public void studyTour() {
		System.out.println("I am study method");
	}
	
	// there can be more than one methods inside a class with different name
	public void city_bus() {
		System.out.println("I am a city Bus");
	}

	// method name can be same as class name, but in lower case
	public void myInfo() {
		System.out.println("I am a method");
		// Can I use/call variable inside method body? Ans: Yes, see next line
		// You don't need an object to call variable inside method
		System.out.println("My Name: " + myName + ", My Age: " + myAge);
	}
	
	public static void main(String[] args) {
		MyInfo tofael = new MyInfo(); // Constructor initialized
		System.out.println("My Name: " + tofael.myName + ", My Age: " + tofael.myAge);
		tofael.studyTour();
		tofael.city_bus();
		tofael.myInfo();
	}

}
