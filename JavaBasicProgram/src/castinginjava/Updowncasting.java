package castinginjava;

class Man {
	static int harshal(int a, int b) {// static method
		int res = a + b;
		System.out.println("res of a+b :" + res);
		return res;
	}

	void pk() {
		System.out.println("hi pk ");
	}
}

class Chiken extends Man {
	double harshal1(double salary) {// non static method
		System.out.println("non static void method: " + salary);
		return salary;
	}

	void kp() {
		System.out.println("HI KP");
	}
}

public class Updowncasting {

	public static void main(String[] args) {

		// object created childclass ref. to child class so access childclass
		Chiken a1 = new Chiken();
		System.out.println("static method call return type: " + Man.harshal(70, 60));
		System.out.println("non static method call return type: " + a1.harshal1(40000));
		a1.kp();
		a1.pk();
		Man b = new Chiken();// upcasting
		Chiken g= (Chiken)b;// Downcast to access specific property of subclass
		Man b1 = a1;// implicit upcasting
		
	}

}
