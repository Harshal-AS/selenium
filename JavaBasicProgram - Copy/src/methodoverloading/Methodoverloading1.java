package methodoverloading;

public class Methodoverloading1 {
	boolean b;
	int empid = 1234;
	static double salary = 45000;

	public static void main(String[] args) {
		int age = 12, empid = 1244, salary = 90000;
		System.out.println("local variable age : " + age);// 12 lOCAL VARIABLE
		System.out.println("local variable empid : " + empid);// 1244 lOCAL VARIABLE
		System.out.println("local variable salary : " + salary);// 90000 lOCAL VARIABLE

		System.out.println("statoc gv salary:" + Methodoverloading1.salary);// 45000 STATIC GLOBAL VARIABLE STD. WAY TO
																			// ACESS
		Methodoverloading1 ref = new Methodoverloading1();
		System.out.println("non static gv boolean: " + ref.b);// false non static global variable
		System.out.println("non static gv empid: " + ref.empid);// 1234
		// START TO METHODS
		Methodoverloading1.harshal();// can't write this inside println as it won't return any value
		System.out.println("STATIC HARSHAL METHOD: " + (Methodoverloading1.harshal(89740)));//// it will execute method
																							//// and you see the return
																							//// value in the consol
		int empid1 = 54231;// it will execute method and storing return value in variable for future use
		System.out.println("change return value harshal: " + empid1);// return value store and future time change the
																		// return value

		System.out.println("non static method kunal: " + ref.kunal(70, 80));
		// return value change
		double res = 200;
		System.out.println("change return value kunal: " + res);
		ref.kunal();
	}

	public static void harshal() {
		System.out.println(" no parameter pass");// no parameter pass
	}

	static int harshal(int empid) {
		System.out.println("harshal1 static:" + empid);
		return empid;

	}

	public double kunal(int num1, int num2) {
		System.out.println("kunal num1: " + num1);
		System.out.println("kunal num2: " + num2);

		double res = num1 + num2;
		System.out.println("kunal res: " + res);
		return res;
	}

	void kunal() {
		System.out.println("hi kunal no parameters pass what happens ");
	}

}
//METHODOVERLOADING=if class has multiple methods having same name but difffrent set og argument or parameters is called methodoverloading.
//OR
//METHODOVERLOADING=method declared more than one in a class body but different set of oarameter or arguments is called methodoverloading..
//likes:
//	1.type of arguments diff.
//	2.numberof arguments diff.
//	3.position of arguments diff.
