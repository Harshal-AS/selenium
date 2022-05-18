package encapsulation;

class jaggu {
	private float f;
	private boolean b;
	

//getter method only read only 
	public float getf() {
		System.out.println("get float method ouside the class");
		return f;
	}

	public boolean getb() {
		System.out.println("get boolean method ouside the class");
		return b;
	}
}

public class Encapsulation2 {

	public static void main(String[] args) {
		jaggu h1 = new jaggu();
		System.out.println("program start");
		System.out.println("access the private data membe outside the class help to getter:" + h1.getf());
		System.out.println("access the private data membe outside the class help to getter:" + h1.getb());
		System.out.println("program end");
		
	}
}
/*1.Getter method help to access private variable outside the class
 * 2.declared with public
 * 3.return type of getter method should be same as private variable
 * 4.it should be return private variable 
 * 
 * 1.Setter method helps to modify or updated private variable outside the class
 * 2.declared with public.
 * 3.return type of setter method should be void.
 * 4.parameter datatype should be same as private variable 
 */

