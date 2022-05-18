package constructor;

public class Cons8 {

	int age;
	double salary;

	Cons8() {
		System.out.println(" having no parameters");
	}

	Cons8(int a) {
		System.out.println(" having int parameters");
		age = a;
	}

	Cons8(double b) {

		System.out.println(" having double parameters");
		salary = b;

	}

	Cons8(int a, double b) {

		System.out.println(" having int-double parameters");
		age = a;
		salary = b;

	}

	public static void main(String args[]) {
		Cons8 pc1 = new Cons8();
		System.out.println("After Zero-para constructor,Age= " + pc1.age);// 0
		System.out.println("After Zero-para constructor,Salary= " + pc1.salary);// 0

		Cons8 pc2 = new Cons8(33);
		System.out.println("After int-para constructor,Age= " + pc2.age);// 33
		System.out.println("After int-para constructor,Salary= " + pc2.salary);// 0

		Cons8 pc3 = new Cons8(34000.34);
		System.out.println("After double-para constructor,Age= " + pc3.age);// 33
		System.out.println("After double-para constructor,Salary= " + pc3.salary);// 34000.34

		Cons8 pc4 = new Cons8(30, 95000.34);
		System.out.println("After int-double-para constructor,Age= " + pc4.age);// 30
		System.out.println("After int-double-para constructor,Salary= " + pc4.salary);// 95000.30
	}
}