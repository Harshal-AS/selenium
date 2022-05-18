package constructor;

public class Constructor1 {
	int age;
	int empid;

	Constructor1() {
		System.out.println("defaut constrctor ");// default constructor written by java compiler at time of compile time
		empid = 1230;
	}

	Constructor1(int a) {
		System.out.println("one para. constructor");
		age = a;
	}

	Constructor1(int b, int a) {
		System.out.println("hi harshal");
		empid = b;
		age = a;
	}

	void display() {
	System.out.println( age+""+empid);
	}

	public static void main(String[] args) {

		Constructor1 h1 = new Constructor1();// no parameter pass to constructor so mot aasign the value
		System.out.println(h1.empid);// 1230
		System.out.println(h1.age);// 0
		h1.display();// 0,1230
		Constructor1 h2 = new Constructor1(20);
		System.out.println(h2.empid);// 0
		System.out.println(h2.age);// 20
		h2.display();// 20,0
		Constructor1 h3 = new Constructor1(5213, 50);
		System.out.println(h3.empid);// 5213
		System.out.println(h3.age);// 50
		h3.display();// 50,5213
	}

}
/**
 * constuctor is used to initilize instance members of the class, Contructor is
 * similar to method but, 1. constuctor name should be same as classname 2.
 * constuctor doesn't have return type and also not returns any value 3.
 * constuctor gets called automatically when an instance/object of a class is
 * created 4. being a programmer we can't call/executed constuctor based on our
 * requirement 5. constuctor are 2 types a. default constuctor : written by java
 * compiler with empty body b. user defined constuctor : written by programmer
 * i. zero parameterized constuctor ii. parameterized constuctor
 */
