package blocks;

public class Blocks2 {

	static int age;
	double salary;
	/* static block or SIB */
	static {
		age = 30;//1
	}
	/* non-static block or IIB */
	{
		salary = 45000.32;
	}
	public static void main(String[] args) {
		System.out.println("main() Starts..");//1
		System.out.println("age: " + Blocks2.age);//2
		System.out.println("---------------------------------");//3
		Blocks2 b1 = new Blocks2();
		System.out.println("salary: " + b1.salary);//4
		System.out.println("main() ends..");//5
	}
}