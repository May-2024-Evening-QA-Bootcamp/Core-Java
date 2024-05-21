package lec05_01_java_methods;

public class StaticAndFinalTypeMethod {
	public static String breed = "BullDog";
	public int age = 2;

	// void type static method
	// static is a local member method of this class
	// other class can't call it
	// static keyword can be used in return type method too
	public static void breedType() {
		System.out.println("The breed of the dog is: " + breed);
	}

	// return type final method
	// when there is a final keyword, you can't change the method
	// what does it mean by change?
	// sometime methods are called and changed by "method overriding"
	// we will learn it later
	// final keyword can be used in void type method too
	public final int dogAge() {
		System.out.println("The age of the dog is: " + age);
		return age;
	}

	public static void main(String[] args) {
		// static methods are called by the class itself, no need of object to call a static method
		StaticAndFinalTypeMethod.breedType();
		
		StaticAndFinalTypeMethod sm = new StaticAndFinalTypeMethod();
		sm.dogAge();
		// final type method can't be changed

	}

}
