package constructor;

public class Cons7 {
	int age;
	double empid;

	Cons7() {
		System.out.println("user define zero parameterized constructor");
		empid = 1234.10;

	}

	Cons7(int a, double b) {
		System.out.println("user define parameterized constructor");
		age = a;
		empid = b;

	}

	void display() {
		System.out.println(age + "  " + empid);

	}

	public static void main(String[] args) {
		Cons7 h1 = new Cons7();

		h1.display();// 0,1234.10
		Cons7 h2 = new Cons7(10, 200.10);// 10,20
		h2.display();// 0,1233.10

	}

}
