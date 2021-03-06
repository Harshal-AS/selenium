package assignments;

public class Allinone {
	int age = 40;// non static gv
	static double salary;
	static int age1 = 41;

	public static void main(String[] args) {
		int age = 22;// local variable
		double salary = 500000.10;// local variable
		System.out.println("local variable age: " + age);// 22
		System.out.println("local variable salary: " + salary);// 500000.10
		// local variable value updated
		age = 21;
		salary = 500000.50;
		System.out.println("local variable age: " + age);// 21
		System.out.println("local variable salary: " + salary);// 500000.0
		// static global variable (classname.variablename)
		System.out.println("static gv age1 :" + Allinone.age1);// 41
		System.out.println("static gv: " + Allinone.salary);// not initilized default store 0
		Allinone.salary = 4000.20;// updated value static gv
		Allinone.age1 = 14;// updated value static gv
		System.out.println("static gv updated value: " + Allinone.salary);
		System.out.println("static gv updated value: " + Allinone.age1);
		// non static gv (created object ,classname referencevariable=new classname();
		Allinone r1 = new Allinone();
		System.out.println("non static gv: " + r1.age);// 40
		// updated value non static gv
		r1.age = 04;
		System.out.println("no static gv updated value:  " + r1.age);
		// initial value non static gv
		Allinone r2 = new Allinone();
		System.out.println("non gv initial value: " + r2.age);
		// method call static and non static method call
		Allinone.harshal();// void return type
		System.out.println(Allinone.harshal1(7));// return type int
		// return type value change
		int notebook = 8;
		System.out.println("change return value method harshal1:" + notebook);

		System.out.println(r1.harshal2(7000.20));// return type double
		// return type value change
		double salary1 = 7000.10;
		System.out.println("change return value method harshal2:" + salary1);
		System.out.println(r1.harshal3(40, 1000.80));// return type int,double
		// return type value change
		double res = 5231.10;
		System.out.println("change return value method harshal2:" + res);

		// methodoverloading
		Allinone.sh();
		System.out.println(Allinone.sh(2, 4));
		// return value change
		int res1 = 8;
		System.out.println("return value change :" + res1);
		System.out.println(r1.sh(9, 1234.40));
		// return value change
		double res2 = 897765.475;
		System.out.println(res2);

		// constructor
		P sum = new P(6, 60.60);
		sum.har(4);
		P sum1 = new P(1, 1);
		sum1.pankaj();
		P sum2 = new P(400.10);
		
		
		// finalkeyword
		System.out.println("final age: "+finalkeyword.age);
		finalkeyword g1=new finalkeyword();
		System.out.println("non static final :"+g1.empid);
		g1.harshal(5);
		finalkeyword.harshal5(2);
	   // Blocks
		System.out.println("program start");
		System.out.println( Blocks8.age);
		 Blocks8 h1=new  Blocks8 ();
		 System.out.println(h1.salary);
		 System.out.println("program end");
		

		/* Method =METHOD on a class to write repeated statements of the method body */

	}

	static void harshal() { // method
		System.out.println("hi harshal ");
	}

	static int harshal1(int notebook) { // method
		int res = notebook;
		System.out.println("harshal1 int res: " + res);
		return res;
	}

	double harshal2(double salary) { // method
		double res = 40000.20;
		System.out.println("harshal2 double res: " + res);
		return res;
	}

	double harshal3(int age, double salary) { // method
		double res = age + salary;
		System.out.println("harshal3 int+salary res: " + res);
		return res;
	}

	/*
	 * method overloading-if class has multiple method having same method with diff.
	 * set of parameter or argument like, 1.number of paremeter diff 2.type of
	 * parameter diff 3.position of parameter diff NOTE INTERVIEW QUESTION=return
	 * type change the method will be not consider the overloading
	 */
	static void sh() {
		System.out.println("hi sh");
	}

	static int sh(int num1, int num2) {
		int res = num1 + num2;
		System.out.println("overloading sh res int: " + res);
		return res;
	}

	double sh(int age, double empid) {
		double res1 = age + empid;
		return res1;
	}
}

/*
 * constructor= constructor name is same as class name . It is used to
 * initilized instsnce member of the class it is similar to method but no return
 * type
 */

class P { // new class
	int age = 6;
	double salary;
	int a = 3;
	double b = 43.89;

	P(int a, double b) {
		this(3, 3);// this statement =it is first statement of the cons
		age = a;
		salary = b;
		this.a = a;// diff between global & local variable at same variable name
		this.b = b;
		System.out.println(age);// 6
		System.out.println(salary);// default 60.60

		System.out.println(this.a);// 3
		System.out.println(this.b);// 43.89
	}

	void har(int age) {
		this.age=age;
		System.out.println(this.age);
	}

	P(int c, int e) {
		age = c;
		age = e;
		System.out.println(age);// 1
		System.out.println(salary);// 0.0
	}

	void pankaj() {
		System.out.println(age + " " + age);// 1,1
	}

	P(double d) {
		this(2, 2.2);// this statement =it is first statement of the cons
		salary = d;
		System.out.println(salary);// 400.1

	}
	/*
	 * 1.THIS KEYWORD =it is used differential global and local variable this keyword
	 * used to cons & method
	 * 1. THIS STTEMENT =it is first statement of the constructor
	 * 2.it is used instance of current class
	 * 3.this statement used only cons
	 */

}
/*finalkeyword =it is non access modifier used to methods,variables ,classes which makes 
 not changable.
 * variable, method ,classes declared with finalkeyword not changae the value all
 * variable declared final keyword initilized variable at same time
 * 
 */
class finalkeyword{   // final class 
	final static int age=23;//final variable
	final int empid=3254; //final variable
	final  void harshal(int age) {// final method
		System.out.println("non static final method");
	}
	final static void harshal5(int a) { // final method
		System.out.println(" static final method");
	}
}
	/*Static & non static blocks// SIB & IIB
	
	 */
	class Blocks8{
		static int age=7;
		double salary=9999.10;
		
	
	static {  // static blocks
		age=7;
		System.out.println("hi ");// executed before main
	}
	
	{   // non static blocks 
		salary=9999.10;
		System.out.println("ohhh");
	}
	static {
		System.out.println(" hi static");
	}
	{
		System.out.println("non static ohhh");
	}
}


