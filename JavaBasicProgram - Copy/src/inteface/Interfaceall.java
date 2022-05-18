package inteface;

interface O { // interface used only variable & methods
	static int age = 5;
	char c = 'A';
	boolean B = true;

	public void harshal();// public used because access modifier interface
//abstract method use only 100% abstract 
}

interface P {

	public void harshal1(); // abstract method use only 100% abstract
}

class Q implements O, P {

	public void harshal() {
		System.out.println(" OVERRIDE HARSHAL METHOD");
	}

	public void harshal1() {
		System.out.println(" OVERRIDE HARSHAL1 METHOD");
	}

	public static int harshal2(int age) {
		return age;
	}

	public void harshal4() {
		System.out.println(c + " : " + age);
	}

}

public class Interfaceall {

	public static void main(String[] args) {
		 Q r1 =new  Q ();
		 r1.harshal();
		 r1.harshal1();
		 r1.harshal4();
		System.out.println(" return type harhal2 method " +Q.harshal2(4));
		
		System.out.println("static age: "+O.age);
		System.out.println("non static char : "+r1.B);
		System.out.println("non static boolean : "+r1.c);		 
		 
	}
	}
/*
 * Interface= to acheive the abstract method & variable& can not complete body
 * it is not used cons
 * Implements of an interface must override all method to child class
 * NOTE=To implements multiple inertface seperate with comma.
 *
  */
