package thisstatements;

class cons5 {
	int age;
	double salary;

	cons5(int age) {
		this(12, 120.10);
		System.out.println("local variable" + age);// 10
		System.out.println("gv variable" + this.age);// 0
	}

	cons5(int age, double salary) {

		System.out.println("Local variable age" + age);// 7
		System.out.println("gv variable age" + this.age);// 0
		System.out.println("Local variable age" + salary);// 110.10
		System.out.println("gv variable age" + this.salary);// 0
		this.age = age;// diffrential between local & gv
		System.out.println("Local variable age" + age);// 7
		System.out.println("gv variable age" + this.age);// 7
		System.out.println("Local variable age" + salary);// 100.10
		System.out.println("gv variable age" + this.salary);// 0
	}

	cons5() {
		this(14);
	}

	void display() {
		System.out.println("method:  " + this.age);
	}
}

public class Thisstatements1 {

	public static void main(String[] args) {
		cons5 ref = new cons5(10);
		ref.display();// 7
		cons5 ref1 = new cons5(7, 100.10);

		ref.display();// 7
		ref1.display();//
	}

}
/*
 * this statement is an instance of current class which is declared inside ths
 * constuctor body its should be first statement inside the constructor body its
 * used to call another constructor of the same class based on parameter.
 */
