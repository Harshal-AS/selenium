package unaryoperator;

import org.omg.Messaging.SyncScopeHelper;

public class Unaryoperator2 {

	public static void main(String[] args) {
		int a = 20, b;
		// b=20+20+21+21+21+21=124,a=21
		b = a++ + --a + ++a + a++ + --a + a;
		System.out.println("a1: " + a);
		System.out.println("b1: " + b);
		System.out.println(".........................");

		a = -14;
		// b=-13+-14+-14+-14+-14+-14=-83,a=-13.
		b = ++a + --a + a++ + --a + a + a++;
		System.out.println("a2: " + a);
		System.out.println("b2: " + b);
		System.out.println(".........................");
		a = -17;
		// b=-17+-17+-17+-17+-17+-17=-102,a=-16
		b = a++ + --a + a-- + ++a + a + a++;
		System.out.println("a3: " + a);
		System.out.println("b3: " + b);
		System.out.println(".........................");
		a = -20;
		// b=-20+-20+-20+-18+-18+-19+-19=-134,b=-18
		b = a++ + --a + a++ + ++a + a-- + a + a++;
		System.out.println("a4: " + a);
		System.out.println("b4: " + b);
		System.out.println(".........................");
		a = 12;
		// b=13+13+15+15+15+13+13=97 a=12.
		b = ++a + a++ + ++a + a + a-- + --a + a--;
		System.out.println("a5: " + a);
		System.out.println("b5: " + b);
		System.out.println(".........................");
	}

}
/*
 * Unary operator two types 1.Increment=a. pre=++a,b. post=a++.
 * 2.Decrement=a.pre=--a, b. post= a--. Pre=First perform the operation then
 * value use Post= First value use then perform the operation
 */
