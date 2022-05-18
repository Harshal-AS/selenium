package exceptionhandling;

public class Exceptionhandling6 {

	public static void main(String[] args) {
		try {
			int a[] = new int[4];
			a[4] = 30 / 0;
		} 
		catch (Exception e) {
			System.out.println("common task completed");
		} 
		catch (ArithmeticException e) {
			System.out.println("task1 is completed");
		} catch (ArrayIndexOutOfBoundsException  e) {
			System.out.println("task 2 completed");
		}
		
		
		System.out.println("rest of the code...");
	}
}
/**
* unreachable code: a block of code which never executes by JVM
*
*/