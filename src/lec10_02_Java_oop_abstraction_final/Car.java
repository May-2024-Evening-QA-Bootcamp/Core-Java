package lec10_02_Java_oop_abstraction_final;

public interface Car {
	// variables are final and static in nature
	public static final int year = 1880;
	
	// abstract method
	public void start();
	public abstract void stop();
	public String brake(String brakeName);
	
	// static method
	public static void gear() {
		System.out.println("This Gear feature is from Car Interface");
	}
	
	// default method
	public default void honk() {
		System.out.println("This Honk feature came from Car Interface");
	}
	
	
	
	
	
	
	
	
	
	
	

}
