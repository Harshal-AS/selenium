package exceptionhandling;
import java.util.Scanner;

public class Exceptionhandling1 {

	
	public static void main(String[] args) {
		System.out.println("program start");
		//1. abnormal statements
		int i,k ,j;
		System.out.println();
		Scanner a=new Scanner(System.in);
		try{
			System.out.println("Enter first num1: ");
			i=a.nextInt();
			System.out.println("Enter first num2: ");
			j=a.nextInt();
		k= i/j;//ArithmeticException
		System.out.println("res: "+k);
		}catch(ArithmeticException v) {
			System.out.println("Exception handled"+v);//java.lang.ArithmeticException: / by zero
		v.printStackTrace();//complete exception detail
		}	
		System.out.println("Programs ends here...");
	}	
}
