package polymorphism;
class Tea {
	 void addition(int age) {   //method overloading 
		
		System.out.println("age: "+age);
	}
}
class Break extends Tea{ // inheritance 
	void addition(int age) { //method overloading 
		
		System.out.println("a1: "+age);
	}
}

public class Runtimepoly4 {

	public static void main(String[] args) {
		 Tea s1=new Break();//upcasting java compiler 
		 s1.addition(70);
		 // object created childclass ref. to childclass so access to childclass member
		 Break s2=new Break ();
		 s2.addition(70);
		 // object created childclass ref. to childclass so access to childclass member
		 Tea s3=new Tea ();
		 s3.addition(70);
	}

}
/* runtime poly/dynamic poly/runtime binding/dynamic binding/leaf binding
 * runtime poly= when a method gets to know implementation at the time of runtime is called runtime poly
 *runtime poly to acheived the method overriding
 *1.inheritance
 *2.upcasting
 *3.method overriding 
 */
