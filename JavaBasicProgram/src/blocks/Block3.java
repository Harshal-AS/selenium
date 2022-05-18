package blocks;

public class Block3 {
	static int age = 25;
	double salary = 15000.57;

	void print() {
		System.out.println("age: " + age);
		System.out.println("salary: " + salary);
	}
	public static void main(String[] args) {
		System.out.println("main() Starts..");//1
		Block3 b1 = new Block3();
		b1.print();//
		b1.salary=45000.32;
		b1.print();//
		System.out.println("main() ends..");
	}
	
	static {
		age=35;//2
	}
	
}
/**
 * If any class contains SIB dn this block gets executed before main()
 * as it doesn't have any name hence its gets called automatically before main
 * if a class has more dn one SIB dn all the SIB gets executed in sequential order before main
 * to execute SIB we must have main
 */ 