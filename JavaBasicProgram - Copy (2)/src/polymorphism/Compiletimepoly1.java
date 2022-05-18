package polymorphism;

public class Compiletimepoly1 {
	void h1() {
		System.out.println("deafault no parameter pass");
	}
	static void h1(int age) {
		System.out.println("h1 method name parmeter pass"+age);
	}
	int  h1(int a,int b) {
		int res =a+b;
		System.out.println("Addition a+b: "+res);
		return res;
	}


	public static void main(String[] args) {
		Compiletimepoly1 r1=new Compiletimepoly1 ();
		r1.h1();
		Compiletimepoly1.h1(10);
		System.out.println("non static method overloading: "+r1.h1(12, 14));
	}

	}

		/**
		 * When a method gets to know its implementation at the time of compilation is known as compile
		 * time poly this can be achieved by using static method overloading
		 */
	