package lec16_03_java_read_and_write;

public class C_when_to_use_throws {
	public static int a = 34;
	public static int b = 0;
	
	public static void division() throws ArithmeticException {
		int div = a/b;
		System.out.println(div);
	}

	// TODO: Why throws is not working here
	public static void main(String[] args) {
		division();
		System.out.println("Code is continuing, because exception is handled");
		System.out.println("Good Night");

	}

}
