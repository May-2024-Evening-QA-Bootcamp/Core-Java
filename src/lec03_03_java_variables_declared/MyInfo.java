package lec03_03_java_variables_declared;

public class MyInfo {
	// variables initialized
	public String myName;
	public byte myAge;
	public short myApartmentRent;	
	public int myYearlySalary;
	public long myBankBalance;
	public float myHeight;
	public double myGrade;
	public char myGender;
	public boolean usCitizen;
	
	// Constructor declared
	public MyInfo() {
		System.out.println("----------:: This is all About Us ::----------");
	}
	
	// method implemented
	public void myInfo() {
		System.out.println("\nMy Name is: " + myName + "\nMy Age: " + myAge + "\nMy Apartment Rent: " + myApartmentRent
				+ "\nMy Yearly Salary: " + myYearlySalary + "\nMy Bank Balance: " + myBankBalance + "\nMy Gender: "
				+ myGender + "\nMy height: " + myHeight + "\nMy Grade: " + myGrade + "\nUS citizen? : " + usCitizen);
	}
	
	/*
	 You must know it:
	 Default value of String is null 
	 Default value of byte is 0
	 Default value of short is 0
	 Default value of int is 0
	 Default value of long is 0
	 Default value of float is 0
	 Default value of double is 0
	 Default value of char is an unicode which is not defined by eclipse IDE [not important]
	 Default value of boolean is false 
	 
	 Here, you must know default value for String, int and boolean [Important interview question]
	 */
	
}
