package exceptionhandling;

public class Exceptionhandling8 {

	public static void main(String[] args) {
	try {
		System.out.println(" throw the eception ni try block");
		int a=25/0;
	}
	catch (ArithmeticException v) {
		System.out.println("excuted the exception");
		System.out.println(v);
	}
	finally {
		System.out.println("Exception  handle/occured or not");
		
	}
	}

}
