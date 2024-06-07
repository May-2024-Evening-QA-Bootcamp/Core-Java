package lec10_02_Java_oop_abstraction_final;

public class Toyota extends ElectricCar implements Car {
	
	// implemented method
	public void toyota() {
		System.out.println("This method is from Toyota Class");
	}

	@Override
	public void start() {
		System.out.println("start method from Car Interface");

	}

	@Override
	public void stop() {
		System.out.println("stop method from Car Interface");

	}

	@Override
	public String brake(String brakeName) {
		String m = "brake method from Car Interface";
		System.out.println(m);
		return m;
	}

	@Override
	public void price() {
		System.out.println("price method from ElectricCar Abstract class");
	}

}
