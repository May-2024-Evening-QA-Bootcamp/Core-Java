package lec24_coding_challenge;

/*
A leap year is exactly divisible by 4 except for century years (years ending with 00). 
The century year is a leap year only if it is perfectly divisible by 400.
*/

public class I02_LeapYear {
	
	public static boolean isLeapYear(int year) {
		// if the year is divided by 4
		if(year%4==0) {
			// if the year is century, and divided by 4 is not leap year, so we have to make sure they are century by dividing with 100
			if(year%100==0) {
				// A century is a leap year when divided by 400
				if(year%400==0) {
					return true;
				} else {
					return false;
				}			
			} else {
				// if the year is not century
				return true;
			}
		} else {
			return false; // not leap year
		}			
	}
	
	public static void main(String[] args) {
		System.out.println(isLeapYear(1700)); // 1800, 1900, 2100
		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(2000));
		System.out.println(isLeapYear(2024));
		System.out.println(isLeapYear(2025)); // false
	}
}
