package thiskeywords;

class Cons5 {
	int age = 8;
	double salary;

	Cons5(int a, double b) {
		System.out.println("Local age:" + a);
		System.out.println("Local salary:" + b);
		age =a;
		salary =b;
		System.out.println("Local age1:" +age);
		System.out.println("Local salary1:" + salary);
	}

	Cons5(int age) {
		
		this.age = age;
		//System.out.println("this keyword use cons in:" + this.age);
	}

	Cons5(double salary) {
		this(14);// this statement is first statement of the constructor b

	}

	void display() {
		System.out.println(age + "" + salary);
	}
}

public class Thiskeyword1 {
	int age;
	static int empid = 1234;

	void harshal(int num1) {
		System.out.println("harshal method:" + num1);
	}
	static	double	kunal(int num1, double salary) {
		double	res = num1 + salary;
			System.out.println("kunal res:" + res);
			return res;
		}
	

	void pranjal() {
		System.out.println("hi harshal np parameter pass default value");
	}

	public static void harshal(int a, int b) {
		int res = a + b;
		System.out.println("Harshal void method static int, int :" + res);
	}

	public int harshal(int a, int b, int c) {
		int res = a + b + c;
		System.out.println("harshal method int,int,int:" + res);
		return res;
	}

	public static void main(String[] args) {
		int empid = 4567;
		Cons5 c1 = new Cons5(10, 200.10);
		c1.display();// 0.0,0
		Cons5 c2 = new Cons5(20, 200.5);
		c2.display();// 0,0.0
		Cons5 c3 = new Cons5(50);// 0,0.0
		c3.display();// 0,0.0
		Cons5 c4 = new Cons5(20.20);
		c4.display();
		Thiskeyword1 ref2 = new Thiskeyword1();
		System.out.println("non static gv:" + ref2.age);// 12
		ref2.age = 13;
		System.out.println("updated non static gv:" + ref2.age);// UPDATED VALUE 13
		// initial value object created
		Thiskeyword1 ref3 = new Thiskeyword1();
		System.out.println("initial value non static gv:" + ref3.age);// INITIAL VALUE 12
		System.out.println("local vARIABLE EMPID:" + empid);// 4567
		System.out.println("GV STATIC vARIABLE EMPID:" + Thiskeyword1.empid);// 4567
		ref2.harshal(7);// harshal void method no return type
		System.out.println(Thiskeyword1.kunal(7, 10.10));// static way to acess
		// return value change as per requiredment
		double res = 80.10;
		System.out.println("return value change kunal int ,double " + res);
		ref2.pranjal();
		Thiskeyword1.harshal(4, 4);// static void no return type direct call
		System.out.println(ref2.harshal(4, 4, 6));
		// return value change
		int res1 = 17;
		System.out.println("change return value,harshal int,int,int:" + res1);

	}

}
