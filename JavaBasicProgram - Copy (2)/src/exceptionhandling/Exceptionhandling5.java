package exceptionhandling;

public class Exceptionhandling5 {

	public static void main(String[] args) {
		try {
			int [] e=new int [5];
			e[4]=30/0;//infinity not out of index
		// any number divided by zero = infinity
		}catch (ArrayIndexOutOfBoundsException t) {
			System.out.println(" Array index out  of bound");
		}catch (ArithmeticException u) {
			System.out.println(" ArithmeticException");
		}catch (Exception v) {
			System.out.println("Exception");
		}
		
		try {
			int [] e=new int [5];
			e[5]=30/3;//infinity not out of index
		// any number divided by zero = infinity
		}catch (ArrayIndexOutOfBoundsException t) {
			System.out.println(" Array index out  of bound");
		}catch (ArithmeticException u) {
			System.out.println(" ArithmeticException");
		}catch (Exception v) {
			System.out.println("Exception");
		}
		
		}
			
	}
	


