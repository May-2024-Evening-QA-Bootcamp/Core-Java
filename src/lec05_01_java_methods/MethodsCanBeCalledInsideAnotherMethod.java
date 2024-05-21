package lec05_01_java_methods;

public class MethodsCanBeCalledInsideAnotherMethod {
	public String breed = "BullDog";
	public int age = 2;

	public String firstName = "Alex";
	public String lastName = "Chao";

	public double price = 500.50;

	public void breedType() {
		System.out.println("The breed of the dog is: " + breed);
	}

	public String fullNameOfTheDog() {
		String fullName = firstName + " " + lastName;
		System.out.println("The name of the dog is: " + fullName);
		return fullName;
	}

	public int dogAge() {
		System.out.println("The age of the dog is: " + age);
		return age;
	}

	public double dogPrice() {	
		System.out.println("The price of the dog is: " + price);
		return price;
	}
	
	// We can call one or more than one method, inside another method
	public String dogDescrition() {
		breedType();
		fullNameOfTheDog();
		dogAge();
		dogPrice();
		return null;
	}

	public static void main(String[] args) {
		MethodsCanBeCalledInsideAnotherMethod mm = new MethodsCanBeCalledInsideAnotherMethod();
		mm.dogDescrition();
	}

}



















