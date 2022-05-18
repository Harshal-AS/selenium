package constructor;

public class Cons6 {
	int age ;
	double salary;
	//deault constructor to written java compiler at compile time
	
	
	public static void main(String args[]) {
		System.out.println("program start");
		Cons6 ref=new Cons6 ();
		System.out.println(ref.age);//0
		System.out.println(ref.salary);//0.0
		System.out.println("program end");
	}}
//deault constructor to written java compiler at compile time