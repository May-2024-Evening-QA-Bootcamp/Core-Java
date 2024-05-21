package lec05_01_java_methods;

public class TheParameterizedMethod {
	
	// We don't need variables to make a relation with parameters like in Constructor
	
	// void type parameterized method
	// What is the Advantage of parameterized methods?
	// it can be reused [called many times] by changing the arguments, 14-16 line
	public void breedType(String breed, int price) {
		System.out.println("The breed of the dog is: " + breed + "\nprice is: " + price);
	}
	
	// can a method be parameterized when they are return type? Yes
	// if a method is parameterized, then no need of variables as 'c' and 'd'
	public int totalPrice(int price1, int price2, int price3) {
		int total = price1 + price2 + price3;
		System.out.println("Total price of the dogs are: " + total);
		return total;
	}
	
	// parameterized method can be void type or return type
	
	public static void main(String[] args) {
		TheParameterizedMethod pm = new TheParameterizedMethod();
		pm.breedType("Bull Dog", 1000);
		pm.breedType("Pitt Bull", 3000);
		pm.breedType("Doverman", 2000);
		System.out.println("-------------------------------------");
		pm.totalPrice(100, 200, 300);
		pm.totalPrice(2563746, 76580, 53756);

	}

}
