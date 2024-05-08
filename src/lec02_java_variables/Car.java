package lec02_java_variables;

public class Car {
	// access modifier: public, private, protected, default is used below
	public String name = "Mercedez";
	private int price = 65000;
	protected boolean madeInUSA = false;
	char quality = 'A'; // default type
	
	
	public static void main(String[] args) {
		// instead of car object, if we write other name, that is fine too
		Car bmw = new Car();
		
		Car car = new Car();
		
		// instead of car object, if we write other name, that is fine too
		Car toyota = new Car();
	}

}
