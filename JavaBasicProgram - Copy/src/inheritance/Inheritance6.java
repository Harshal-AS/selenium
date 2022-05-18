package inheritance;

class A {

	A() {

		System.out.println("1cons user defined zero parameter pass");
	}

	public void display() {
		System.out.println("A");
	}
}

class B extends A {
	int num2 = 12;

	B(int num2) {
		super();// IT IS USE CONS CALL TO ONE CLASS TO OTHER CLASS

		System.out.println("2cons user defined int parameter pass");
	}

	public void display1() {

		System.out.println("B extends A");
	}
}

class C extends B {
	double salary = 457;

	C(double salary1) {
		super(12);// IT IS USE CONS CALL TO ONE CLASS TO OTHER CLASS
		System.out.println("3cons user defined int parameter pass");
		System.out.println("3cons user defined int parameter pass");
	}

	public void display2() {
		System.out.println(super.num2);// it is used super keywords
		System.out.println("C extends B");
	}
}

class D extends C {
	double salary = 1234;

	D(double salary) {
		// it is super statements
		super(1200.10);// IT IS USE CONS CALL TO ONE CLASS TO OTHER CLASS
		System.out.println("4cons user defined int parameter pass");

		System.out.println(super.salary);// it is used super keywords
	}

	public void display3() {

		System.out.println("D extends C");

	}
}

public class Inheritance6 {

	public static void main(String[] args) {
		D g1 = new D(100.10);// instance of child class
		g1.display();
		g1.display1();
		g1.display2();
		g1.display3();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		C g2 = new D(100.10);// c is the refereed to parents class and d instance
		g2.display();// object created childclass D
		g2.display1();// display3 not vissible to acess childclass d parents
		g2.display2();

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		B g3 = new C(100.11);// B is the refereed to parents class and C instance
		g3.display();// object created childclass C
		g3.display1();// display3,disly2 not vissible to acess childclass d parents

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		A g4 = new B(11);// A is the refereed to parents class and B instance
		g4.display();// object created childclass B
		// display3,disly2,disly1 not vissible to acess childclass d parents

	}
}
