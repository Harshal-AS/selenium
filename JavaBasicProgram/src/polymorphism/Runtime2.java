package polymorphism;

class Car {
	void run() {//methodoverloading
		System.out.println("running");
	}
}
class innova extends Car {//inheritance
	void run()
	{
		System.out.println("running fast at 120km");
	}
}
public class Runtime2 {
	public static void main(String args[]) {
		Car c = new innova();//upcasting
		c.run();//
	}
}
/**
 * When a method gets to know its implementation at the time of execution/rum time is known as run
 * time poly this can be achieved by using method overriding
 * 1. Inheritance
 * 2. Upcasting
 * 3. Method Overriding
 */

