package assignments;

public class Totalrecallconcepts {
	static int empid = 12;
	float f = 40.10f;

	public static void main(String[] args) {
		int age = 40;
		double salary = 50000;
		System.out.println("local variable age" + age);// 40
		System.out.println("local variable salary" + salary);// 50000
		System.out.println("static global variable:" + empid);// 12 direct way to acess static
		System.out.println("static global variable:" + Totalrecallconcepts.empid);// 12std.cway to acess static
		Totalrecallconcepts g1 = new Totalrecallconcepts();// non static created a object
		System.out.println("non static gv:" + g1.f);// 40.10non static created a object
		g1.f = 20.10f;
		System.out.println("updateded non static gv:" + g1.f);
		// initial value if non static global variable 40.10f
		// creared new object
		Totalrecallconcepts g2 = new Totalrecallconcepts();
		System.out.println("initial value:" + g2.f);
		System.out.println(Totalrecallconcepts.harshal(70, 80));
//System.out.println(harshal(70, 80));//or
//return value change 
		int res = 500;
		System.out.println("harshal method return value vhange as per requirements:" + res);// 500
		System.out.println(g1.kunal(20, 100000));// non static method call
//change the return value 
		double res1 = 854600;
		System.out.println("kunal non static return value change:" + res1);
		g1.getinterest(70, 800, 90);
		g1.Addition(50, 40);
		System.out.println("Addition ,method name:" + Totalrecallconcepts.Addition(40, 5000.10, 30));
//return valur change
		double res4 = 564231;
		System.out.println("Addition res change return value:" + res4);
	}

	public static int harshal(int num1, int num2) {
		System.out.println("harshal num1:" + num1);// 70
		System.out.println("harshal num2:" + num2);// 80
		int res = num1 + num2;
		System.out.println("harshal result:" + res);// 150
		return res;// 150
	}

	double kunal(int num1, double salary) {
		System.out.println("kunal num1:" + num1);// 20
		System.out.println("kunal salary:" + salary);// 100000
		double res = num1 + salary;
		System.out.println("kunal result:" + res);// 1200000
		return res;// 1200000
	}

	void getinterest(int p, double r, int t) {
		double res = (p * r * t) / 100;
		System.out.println("get interest :" + res);// void no return value
	}

	public void Addition(int a, int b) {
		int res = a + b;
		System.out.println("addition a:" + a);// 50
		System.out.println("addition b:" + b);// 40
		System.out.println("addition res:" + res);// 90
	}

	static double Addition(int a1, double b1, int c1) {
		System.out.println("addition a1:" + a1);// 40
		System.out.println("addition b1:" + b1);// 5000.10
		System.out.println("addition c1:" + c1);// 30
		double res1 = a1 + b1 + c1;
		System.out.println("addition res1:" + res1);// 5070.10
		return res1;// 570.10

	}

}
