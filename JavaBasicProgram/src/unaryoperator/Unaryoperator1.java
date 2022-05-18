package unaryoperator;

public class Unaryoperator1 {

	public static void main(String[] args) {
		int a=5;
		System.out.println("a++:"+(a++));//5
		System.out.println("a:"+(a));//6
		
		int b=6;
		System.out.println("b--:"+(b--));//6
		System.out.println("b:"+(b));//5
		
		int c=7;
		System.out.println("++c:"+(++c));//8
		System.out.println("c:"+(c));//7
		
		int d=8;
		System.out.println("--d:"+(--d));//7
		System.out.println("d:"+(d));//7
	}

}
/*
 * Unary operator two types
 * 1.Increment=a. pre=++a,b.  post=a++.
 * 2.Decrement=a.pre=--a, b. post= a--.
 * Pre=First perform the operation then value use 
 * Post= First  value use  then perform the operation
 */
