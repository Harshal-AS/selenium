package singletoneclass;

class A {
	//String f="Harshal";
	private A (){
		System.out.println("zero parameter");
	}
	private static A ref=new A ();
	String f="Harshal";
	static A g() {
		return ref;
	}
	void a() {
		System.out.println(" hi regular method");
	}
}

public class Singletone1 {

	public static void main(String[] args) {
	//A ref=new A ();//compile time error due to singleton class concept
	//OR
		
		A q2=A.g();// class name reference variable variable call to methods
		q2.a();
		System.out.println(q2.f);//"Harshal"
		q2.f="Austrillia";
		System.out.println(q2.f);//"Austrillia"  updated value
		// Instantiating Singleton class with variable x
		A q3=A.g();
		System.out.println(q3.f);
	}

}
/* Single tone=it is only one instance should be created & single object used to all other classes
 Single tone class refer below points 
  *1. create class cons private.
  *2.create static instance of current class.
  *3. create static method which  should be return object of current class
 * 
 * */
