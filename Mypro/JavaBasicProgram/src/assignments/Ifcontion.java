package assignments;

public class Ifcontion {

	public static void main(String[] args) {
		int num=55;
		Ifcontion.checkEvenOddNumber(700);
		checkEvenOddNumber(711);
		System.out.println("number is even "+ Ifcontion.isNumberEven(100));
		checkEvenOddNumber2();
	} 
	/**
	 * static method with argument/parameter and return type as void
	 */
	static void checkEvenOddNumber(int num) {//int num=700;
		if(num%2==0){  
			System.out.println("Given number is even number: "+num);  
		}else{  
			System.out.println("Given number is odd number: "+num);  
		}
	}
	/**
	 * static method with argument and return type as boolean
	 */
	static boolean isNumberEven(int num) {
		if(num%2==0){  
			return true;
		}else{  
			return false;
		}
	}
	/**
	 * static method with no argument and return type as void
	 */
	static void checkEvenOddNumber2() {
		int num=50;
		if(num%2==0){  
			System.out.println("Given number is even number: "+num);  
		}else{  
			System.out.println("Given number is odd number: "+num);  
		}
	}
}  