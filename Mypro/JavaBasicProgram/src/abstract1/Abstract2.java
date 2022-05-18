package abstract1;

abstract class wheel {// abstract class
	int empid = 1234;
	int age = 10;

	wheel(int empid, int age) {// cons
		System.out.println("local variable age:" + age);
		System.out.println("local variable age:" + empid);
	}

abstract void harshal();// abstract method without body

	 void display() {// non abstract method normal method
		
		System.out.println("gv variable age:" + this.age);//this keywords uses
		System.out.println("gv variable age:" + this.empid);//this keywords uses
	}
}

class tyre extends wheel {

	 void harshal() {
		System.out.println("abstract method overried to subclass ");
	}

	tyre(int age) {// cons use
		super(5896, 50);// super statement use in only cons
	}

}

 class Abstract2 {

	 static void main(String[] args) {

		tyre h1 = new tyre(5);
		h1.harshal();
		h1.display();

	}

}
