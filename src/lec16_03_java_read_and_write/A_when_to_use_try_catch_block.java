package lec16_03_java_read_and_write;

// Compilation error vs Runtime Error
// Compilation error happened during compile time
// Runtime error happened during Run time, so you see exception in the console
// Mainly runtime error is called Exception

/*
An Exception is an unwanted event that interrupts the normal flow of the program 
that happens during the run time. When an exception occurs program execution gets terminated.
In such cases, we get a system-generated error message.

How can we handle exception? -- very very important interview question
By --> try, catch, finally, throw, throws
*/
public class A_when_to_use_try_catch_block {

	public static void main(String[] args) {
		int a = 34;
		int b = 0;
		int division = a/b;
		System.out.println(division); // Exception occurred here
		System.out.println("Is the code continuing? because exception may occured above");	

	}

}
