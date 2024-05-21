package lec05_01_java_methods;

public class Cat {
	public String color = "White";
	public int price = 500;
	
	// void type method
	// This method never say what type of parameterized data we are getting
	// parameterized variable: byte, short, int, long, float, double, char, boolean
	// non pure parameterized data: String
	public void catColor() {
		System.out.println("The color of the cat is " + color);
	}
	
	public void catPrice() {
		System.out.println("The price of the cat is " + price);
	}

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.catColor();
		cat.catPrice();

	}

}
