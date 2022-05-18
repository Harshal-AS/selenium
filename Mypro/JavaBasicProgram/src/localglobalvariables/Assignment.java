package localglobalvariables;

public class Assignment {
 int age=12;
static double salary=1234.56;



void method() {
	System.out.println( Assignment.salary);
}
static void men() {
	Assignment r1=new Assignment();
	System.out.println(r1.age);
}

	public static void main(String[] args) {
		Assignment r1=new Assignment();
		//System.out.println(r1.age);
		System.out.println( Assignment.salary);
	System.out.println(r1.age);
	}

}
/* Q1 we can call non static variable on static method .
 * Q1. we can call static variable on non static method.
 */
