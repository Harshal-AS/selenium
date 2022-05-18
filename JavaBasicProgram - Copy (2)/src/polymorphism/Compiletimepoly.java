package polymorphism;
/* polymorphism
 There are two types
 1.compile time poly/stattic thime poly/static binding/compile time binding/Early binding
 to achieved 
 1.method overloading
 2.cons overloading
 * */

public class Compiletimepoly {
	static void harshu() { //static method overloading only
		System.out.println("loccal variable age");
	}

	static int harshu(int age) {//static method overloading only
		return age;
	}

	static double harshu(int age, double salary) { //static method overloading only
		double res = age + salary;
		System.out.println(age);
		System.out.println(salary);
		return res;
	}

	Compiletimepoly() { // cons overloading
		System.out.println(" cons methodoverloading  zero parameterized ");
	}

	Compiletimepoly(int age) { // cons overloading
		System.out.println(" cons methodoverloading parameterized: " + age);// 10
	}

	public static void main(String[] args) {
		//Compiletimepoly r = new Compiletimepoly(10);
		Compiletimepoly.harshu();
		System.out.println(" static int return type harshu method call:" + Compiletimepoly.harshu(5));
		System.out.println(" non static cons call: " +  Compiletimepoly.harshu(7, 7.7));
	}

}
/* Polymporphism in java= It is perform the single action different ways
  * When a method gets to know its implementation at the time of compilation is known as compile
 * time poly this can be achieved by using static method overloading
  */
