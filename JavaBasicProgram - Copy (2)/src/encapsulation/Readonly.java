package encapsulation;

class tea {
	private long l = 123456;
	private float f = 400.10f;
// getter method use only read only
	public long getl() {
		return l;
	}

	public float getf() {
		return f;
	}
}

public class Readonly {

	public static void main(String[] args) {
		tea t1 = new tea();
		System.out.println("read only get method long:" + t1.getl());
		System.out.println("read only get method float:" + t1.getf());

	}

}
/*
 * 1. Getter method helps to access private variable outside the class
 * 2.declared with public 3.the return type of getter method same as the private
 * variable 4.it should be return private variable
 */
