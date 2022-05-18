package singletoneclass;

class Singletone4 {
	private Singletone4() {
		System.out.println(" cons declared private so restricate the class ");
	}

	private static Singletone4 demo = new Singletone4();
	// declared string variable
	public String a = "Pankaj";
	public String b = "ja";

	static Singletone4 sha() {
		System.out.println(" create static method return should be object of current class");
		return demo;
	}

	void method() {
		System.out.println(" regular method");
	}
}

public class singletoneclass3 {

	public static void main(String[] args) {
		// Singletone a=new Singletone ();// /can't create an object of Singleton class
		// as its constructor is declared as private
		// Instantiating single tone class with variable c
		Singletone4 c = Singletone4.sha();
		System.out.println("String from c " + c.a);
		System.out.println("String from c " + c.b);
		//System.out.println(Singletone4 .sha());
	//	c.method();
		// Instantiating single tone class with variable d
		Singletone4 d = Singletone4.sha();
		System.out.println("String from d " + d.a);
		System.out.println("String from d " + d.b);
		// Instantiating single tone class with variable e
		Singletone4 e = Singletone4.sha();
		System.out.println("String from e " + e.a);
		System.out.println("String from e" + e.b);

		System.out.println("Adding upper case  a variable ");
		c.a.toUpperCase();
		System.out.println(c.a);
		System.out.println(d.a);
		System.out.println(e.a);
		System.out.println("\n");
		System.out.println("Adding upper case  b variable ");
		c.b.toUpperCase();
		System.out.println(c.b);
		System.out.println(d.b);
		System.out.println(e.b);

		System.out.println("Adding lowercase   a variable ");
		c.a.toLowerCase();
		System.out.println(c.a);
		System.out.println(d.a);
		System.out.println(e.a);

		System.out.println("Adding lowercase  b variable ");
		c.b.toLowerCase();
		System.out.println(c.b);
		System.out.println(d.b);
		System.out.println(e.b);

	}

}
/* Single tone=it is only one instance should be created & single object used to all other classes
Single tone class refer below points 
 *1. create class cons private.
 *2.create static instance of current class.
 *3. create static method which  should be return object of current class
* 
* */

