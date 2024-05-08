package lec02_java_variables;

public class MyInfo {
	// This is a class body
	// A class body contains first: variables, second: Constructor, third: methods
	// variables name can't be duplicated
	// variable name starts with lower case and follow camel case feature and snake case pattern 
	// variables can be either declared (no value assigned) or initialized (value assigned) 
	// variables always ended up with a semicolon ;
	// if semicolon is absent, the code will show compilation error
	
	// String itself is a class, represents for String type variable here
	// String is not a pure primitive data type, important interview question
	
	// variable declared
	public String schoolName;
		
	// variable initialized
	public String country_name = "USA";
	
	// here, public is access modifier, String is the type of the variable, 
	// "myName" is the name of the String type variable
	public String myName = "Tofael";
	// String type values are always inside double quotation
	
	// int [We say Integer] is the type of the variable, 
	// "myYearlySalary" is the name of the int type variable
	public int myYearlySalary = 3547253;
	// int type values are with no quotation
	
	// char is the type of the variable, 
	// "myGender" is the name of the char type variable
	public char myGender = 'M';
	// char type values are always inside single quotation and best practice to use in upper case
	
	// boolean is the type of the variable, 
	// "usCitizen" is the name of the boolean type variable
	public boolean usCitizen = true;
	// boolean type values are with no quotation. Represented by true or false in lower case only
	
	// float are used for "non complete number" [a number with decimal]
	// "myHeight" is the name of the float type variable
	public float myHeight = 1.6453f;
	// we must have to use lower case f, at the end of float value
	// float type values are with no quotation
	
	// How to create a Constructor?
	// Constructor name is same as 'Class name', so starts with Upper Case 
	// and follow camel case or snake case feature
	// This Constructor is declared here	
	public MyInfo() {
		// Constructor body
		System.out.println("I am a Constructor from MyInfo class");
	}
	
	public static void main(String[] args) {
		// You have to create an object generally [not mandatory] inside the main method
		// MyInfo (blue color) is a class, tofael (yellow color) is an object, also called reference type variable
		// object name generally start with lower case, follow camel case or snake case feature
		// = equal operator, new is a keyword of Java
		
		// What happened below? Try to Understand, if don't, no problem
		// an object is created (tofael) (by you) from 'MyInfo' class (following blueprint) which (object) is new and MyInfo type
		// This action (line 78) --> (when an object is created from a class) is called "instantiation", (vvImp info)
		// Then we say the class (MyInfo) is instantiated or Class Instantiated
		
		/*
		 I will teach in the next class
		 How the variables are printing from here where variables are absent in this class?
		 Ans: Inside same package, public, protected and default type content can be accessible [this info will come later]
		 Ans: Inside different package, only public type content can be accessible [this info will come later]
		*/
				
		// This is not mandatory to write the object name ---> same as class name
		// Also, we can create more than one object from a class
		
		// When an object [tofael] is created from a class [MyInfo], Constructor is initialized
		MyInfo tofael = new MyInfo();
		System.out.println(tofael.myName);
		System.out.println(tofael.myYearlySalary);
				
	}

}
