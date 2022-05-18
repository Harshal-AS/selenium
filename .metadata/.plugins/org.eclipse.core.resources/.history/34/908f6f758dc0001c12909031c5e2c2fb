package exceptionhandling;
//Throwing Unchecked Exception
public class Exceptionhandling9 {
	//function to check if person is eligible to vote or not 
	public static void validage(int age) {
	if(age<18) {
		 //throw Arithmetic exception if not eligible to vote  
        throw new ArithmeticException("Person is not eligible to vote");  
	}
	else {
		System.out.println(" person eligible to vote ");
	}
}
	//main method
	public static void main(String[] args) {
		//calling the function
		
		try {
			Exceptionhandling9.validage(14);
			//validage(14);
		}
		catch (ArithmeticException h) {
			System.out.println(h);
		}
		finally {
			System.out.println(" exception  handle or not");
		}
		}

	}


