package lec21_coding_challenge;

public class A00_coding_fundamental {

	public static void main(String[] args) {
		// ParameterizedType method
		int val1 = 82;
		int val2 = 82;

		if (val1 > val2) {
			System.out.println(val1 + " is greater than " + val2);
		} else {
			System.out.println(val1 + " is not greater than " + val2);
		}
		
		System.out.println("------------------------o---------o--");
		for(int i = 0; i<5; i++) {
			System.out.println(i);
		}
		
		System.out.println("-----o---------o----------------------");
		String [] allPresident = {"Joe Biden", "Donald Trump", "Barack Obama", "George Bush Jr", "Bill Clinton"}; 
		for(int i = 0; i<allPresident.length; i++) {
			System.out.println(allPresident[i]);
		}
	
	}

}
