package assignments;

class A {
	static  void Harshal1() {
		System.out.println("Harshal1 method1");
	}

	static  void Harshal2() {
		System.out.println("Harshal2  method1");
	}

	static  void Harshal3() {
		System.out.println("Harshal3  method1");
	}

}

class B extends A {
	static  void Harshal1() {
		System.out.println("Harshal1  method2");
	}

	static  void Harsha2() {
		System.out.println("Harshal2  method2");
	}

	static  void Harshal3() {
		System.out.println("Harshal3  method2");
	}
}

class C extends B {
	static void Harshal1() {
		System.out.println("Harshal1  method3");
	}

	static  void Harshal2() {
		System.out.println("Harshal2  method3");
	}

	static  void Harshal3() {
		System.out.println("Harshal2  method3");
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		C ref =new C ();
	   B.Harshal1((),B.Harsha2(),B.Harshal3(),C.Harshal1(),C.Harshal2(),C.Harshal3());

	}

}
