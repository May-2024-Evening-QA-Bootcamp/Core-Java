package lec10_03_java_oop_polymorphism;

public class TestCalculator {

	public static void main(String[] args) {
		System.out.println("-------- Land Calculator --------");
		LandCalculator lc = new LandCalculator();
		lc.landCalculator(); // void type method -01 initialized
		lc.landCalculator(23, 86);  // void type parameterized method -02 initialized
		lc.landCalculator(33, 16);  // void type parameterized method -02 initialized
		lc.landCalculator(23, 86, 10);  // void type parameterized method -03 initialized
		lc.landCalculator(88, "65", 15);  // void type parameterized method -04 initialized
		lc.landCalculator(23.543f, "32", 210);  // return type parameterized method -05 initialized
		lc.landCalculator(23, 86, 10, 41);  // return type final parameterized method -06 initialized
		LandCalculator.landCalculator(23, 86, 10, 41, 90); // void type static parameterized method -07 initialized
	
		System.out.println("\n-------- Modern Calculator --------");
		ModernCalculator mc = new ModernCalculator();
		mc.landCalculator(); // void type method -01 initialized
		mc.landCalculator(23, 86);  // void type parameterized method -02 initialized
		mc.landCalculator(33, 16);  // void type parameterized method -02 initialized
		mc.landCalculator(23, 86, 10);  // void type parameterized method -03 initialized
		mc.landCalculator(88, "65", 15);  // void type parameterized method -04 initialized
		mc.landCalculator(23.543f, "32", 210);  // return type parameterized method -05 initialized
		
	}

}
