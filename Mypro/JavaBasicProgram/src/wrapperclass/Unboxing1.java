package wrapperclass;

public class Unboxing1 {

	public static void main(String[] args) {
		Integer age = 12;
		int b = age.intValue();// un-boxing
		System.out.println(age == b);// t
		System.out.println(age);// 12
		System.out.println(b);// 12

		Double a = 1200.20;
		double salary = a.doubleValue();// un-boxing
		System.out.println(a);// 1200.2
		System.out.println(salary);// 1200.2
		System.out.println(a == salary);// t
		System.out.println(".................................................");
		Character c = 'A';// OBJECT CONVERT TO PRIMATIVE IS CALLED UNBOXING
		char d = c.charValue();
		System.out.println(c);// 'A'
		System.out.println(d);// 'A'
		System.out.println(c == d);// t
		System.out.println("...a..a..a...a..a..a...a...a..a..a...a...a..a.");
		Float f = 10.20f;
		float g = f.floatValue();
		System.out.println(f);// 10.20
		System.out.println(g);// 10.20
		System.out.println(f == g);// t

	}

}
