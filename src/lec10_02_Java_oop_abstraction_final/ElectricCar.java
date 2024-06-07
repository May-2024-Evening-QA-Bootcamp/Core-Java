package lec10_02_Java_oop_abstraction_final;

public abstract class ElectricCar {
	// non abstract method
	public void battery() {
		System.out.println("The battery is very efficient and is from ElectricCar Abstract class");
	}
	
	// abstract method
	public abstract void price();

}
