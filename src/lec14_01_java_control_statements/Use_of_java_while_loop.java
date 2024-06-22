package lec14_01_java_control_statements;


/*	

for(initialization block with data type; conditional block; incremental or decremental block) {
		System.out.println()
		or we can use condition
}

*/

/*	
	int i = 0;
     while(conditional block){ 
			System.out.println();
			incremental or decremental block;
     }
*/

public class Use_of_java_while_loop {

	public static void main(String[] args) {
		System.out.println("-------------- for loop --------------");
		for(int i=0; i<5; i+=1) {
			System.out.println(i);
		}
		
		// incremental block is used
		System.out.println("\n-------------- while loop 01 --------------\n");	
		int i = 0;  
		while(i<5) {
			System.out.println(i);
			i+=1;
		}
		
		System.out.println("\n---------- while loop 02 ----------\n");
		int j = 0;
		while(j<=10) {
			System.out.println(j);
			j=j+2; // only change here
		}
		
		// decremental block is used
		System.out.println("\n---------- while loop 03 ----------\n");
		int k = 10;
		while(k>=5) {
			System.out.println(k);
			k--;
		}
		
		System.out.println("\n---------- while loop 04, condition false, nothing will print as outcome ----------\n");
		// as condition is false, nothing will execute
		int l = 20;
		while (l <= 5) {
			System.out.println("The value is: " + l);
			l -= 2;
		}
		
		System.out.println("\n---------- while loop 05 ----------\n");
		int n = 3;
		int m = 16;
		while (m>5) {
			System.out.print(m*n + ", "); // we use print here, not println
			m -=3;
		}
		
		// outcome of m: 16, 13, 10, 7
		// 48, 39, 30, 21
		
		// In line 45, if we use m<=16, it will be an infinite loop
		// it will keep printing until your memory is full or the range of int is printed
		// This is a mistake, we don't create infinite loop
		
	}

}
