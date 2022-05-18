package polymorphism;
class dog{
	void harshal(double salary) {
		System.out.println(" method ovrride to subclass: "+salary);
	}
	
	}

class cat extends dog{// inheritance
	void harshal(double salary) {//method ovrride to subclass cat
		System.out.println(" method ovrride to subclass cat: "+salary)	;
}
}

public class Runtimepolyall {

	public static void main(String[] args) {
		 dog m1=new cat(); //upcasting
		 m1.harshal(20.20);
		 cat m2=new cat();
		 m2.harshal(10.10);
		 

	}

}
/*runtime poly= when a method gets to know implementation at the time of runtime is called runtime poly
*runtime poly to acheived the method overriding
*1.inheritance
*2.up casting
*3.method overriding 
*/
