package constructor;

public class Constructor2 {
	int age;// constructor is used initilized instance member of the class
	double empid;

	Constructor2() {
		System.out.println("zero pararemeterized constructor");
       

	}

	Constructor2(int a) {
		System.out.println("num1");
		age = a;
	}

	Constructor2(double b) {
		System.out.println("num1");
		System.out.println("c");
		empid = b;
	}

	Constructor2(int a, double b) {
		System.out.println("three pararemeterized constructor");
		age = a;
		empid = b;
	}

	public static void main(String[] args) {
		Constructor2 ref = new Constructor2();// constructor call and assign the value
		System.out.println(ref.age);// 0 constructor is used initilized instance member of the class
		System.out.println( ref.empid);// 0 constructor is used initilized instance member of the class

		Constructor2 ref2 = new Constructor2(40);//
		System.out.println(ref2.age);// 40
		System.out.println(ref2.empid);// 0
		Constructor2 ref3 = new Constructor2(1234);//
		System.out.println(ref3.age);//0
		System.out.println(ref3.empid);// 1234

		Constructor2 ref4 = new Constructor2(50, 7045);
		System.out.println(ref4.age);// 50
		System.out.println(ref4.empid);// 7045
	
	}
}
/* Constructoroverloadind= If a class multiple constructor having same name but diff.set of parameter or arguments
 likes
 1.type of arguments diff
 2.number of arguments diff
 3.position of arguments diff */



