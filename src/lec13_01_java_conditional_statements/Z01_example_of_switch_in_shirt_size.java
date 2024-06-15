package lec13_01_java_conditional_statements;

public class Z01_example_of_switch_in_shirt_size {

	public static void main(String[] args) {
		char size = 'y';
		
		// switch condition
		switch(size) {
		
		case 'S':
			System.out.println("Yes we have your Small size Shirt");
			break;
			
		case 'M':
			System.out.println("Yes we have your Medium size Shirt");
			break;
			
		case 'L':
			System.out.println("Yes we have your Large size Shirt");
			break;
		
		case 'X':
			System.out.println("Yes we have your Extra Large size Shirt");
			break;
			
		default:
			System.out.println("Sorry! We don't have your " + size + " size Shirt");
			break;	
			
		}

	}

}
