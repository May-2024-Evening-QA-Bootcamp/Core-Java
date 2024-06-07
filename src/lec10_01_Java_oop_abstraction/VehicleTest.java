package lec10_01_Java_oop_abstraction;

public class VehicleTest {

	public static void main(String[] args) {
		System.out.println("\n--------------------- Regular class Toyota ------------------------\n");
		Toyota toyota = new Toyota();
		toyota.toyota();
		toyota.toyotaPrice();
		// toyota.countryOfOrigin(); // if you call a static method by object, it shows warning
		Toyota.countryOfOrigin();
		// if a method is static, no help needed from object, the class or Interface can directly call it.
		toyota.rent();
		toyota.carryingGoods();
		toyota.carryingPassenger();
		toyota.start();
		toyota.stop();
		toyota.lightWeight();
		toyota.expensive();
		toyota.canFloat();
		toyota.price();
		toyota.brake("ABUL Brake");
		toyota.carName();
		toyota.autoPilot();
		toyota.carRating();
		toyota.battery();
		// toyota.yearOfEstablishment();
		Toyota.yearOfEstablishment(); // this static method is from Electric Car
		// yearOfEstablishment() is a static method in Abstract class. Toyota class, (not object) can extends that Abstract class, 
		// so, Toyota itself can initialize that method, but in terms of Interface, it (here gear method) is not allowed for Toyota [line 32-33]
		toyota.flyingFeature();
		// toyota.gear();
		// Toyota.gear();
		// gear () is a static method of an Interface, static method of an Interface can't be call by object of a regular class (line 32)
		// or by the regular class itself (line 33)
		toyota.honk();
		
		System.out.println("Toyota manufactured in: " + toyota.yearOfManufacture);
		System.out.println("Variable from Abstract Class: " + toyota.nameofTheElectricCar);
		// System.out.println(toyota.year); // This got warning
		System.out.println("The Car invented in: " + Toyota.year );
		// as "year" variable is static and Toyota implements Car, that's why no error
		
		System.out.println("\n--------------------- Interface Car ------------------------\n");
		// 'Cannot instantiate the type Car' which is an Interface. Why?
		// Interview question: why Interface can't be instantiated? 
		// Ans: because implementation is not complete [as abstract methods present] inside Interface
		// Interface carry abstract method
		// What is the solution?
		// an Interface can't be instantiated, it needs the help of a concrete class, 
		// Why Toyota is a concrete class here, 
		// Because Toyota helps to implement the Car Interface by "Toyota implements Car"
		Car car = new Toyota();		
		// Car car2 = new Ferrari(); // Ferrari class never implements Car Interface
		car.start();
		car.stop();
		car.brake("Kabir Brake");
		// car.gear(); // because static method
		Car.gear();
		// no need of object, Interface/class can directly call static methods, 
		// but static method in abstract class can be called by Regular class Toyota object (but got warning), Regular class can call directly
		car.honk();
		car.rent();
		car.carryingPassenger();
		car.carryingGoods();
		System.out.println("The Car invented in: " + Car.year); // year was static in nature
		
		System.out.println("\n--------------------- Abstract class ElectricCar ------------------------\n");
		// Cannot instantiate the type ElectricCar which is an Abstract Class. Why?
		// Interview question: why Abstract Class can't be instantiated? 
		// because implementation is not complete [as abstract methods present] in Abstract Class
		// an Abstract Class can't be instantiated, it needs the help of a concrete class, 
		// Why Toyota is a concrete class here, 
		// Because Toyota helps to extends ElectricCar (the Abstract Class) by "Toyota extends ElectricCar"
		ElectricCar electricCar = new Toyota();
		// ElectricCar electricCar2 = new Mercedez();
		electricCar.battery();
		electricCar.price();
		electricCar.carName();
		electricCar.carRating();
		ElectricCar.yearOfEstablishment();
		electricCar.flyingFeature();
		electricCar.autoPilot();
		electricCar.expensive();
		electricCar.canFloat();
		electricCar.costOfTesla = 65000;
		System.out.println("Electric Car name: " + electricCar.nameofTheElectricCar + ", and price: " + electricCar.costOfTesla);
		
	}

}
