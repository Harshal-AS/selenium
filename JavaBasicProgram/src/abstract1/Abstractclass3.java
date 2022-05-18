package abstract1;
abstract class man{
	int age=10;
	double salary=5000.10;
	abstract void harshal();// abstract method without complete body or without body
	
	 void pankaj() { // regular method
		System.out.println("regular method");				
}
}

class hand extends man{
	 void harshal() { //abstract method ovrride to subclass/childclass
		System.out.println(" abstract method ovrride to subclass");
	 }
		 void bhola(double salary) { // regular method
			 super.salary=salary;// super keyword use method& cons
			System.out.println( "bhola method this keyword use salary: "+super.salary);//
		}
		 hand(){
			
			System.out.println(" zero parameterized");
		}
	}
class finger extends hand{
	void harshal() {
		System.out.println("abstract method ovrride to subclass");	
	}
	 void regu(int age) {//  non- abstract method/regular method/concrete method  
		 super.age=age;// super keyword use method& cons
		System.out.println("regu method this keyword use age: "+ super.age);//	
	}
	finger(int age, double salary){
		super();// super statement first statement of cons only use cons no method use
		// super() is used to cons call to the only  parent class 
		 super.age=age;// super keyword use method& cons
		 super.salary=salary;// super keyword use method& cons
		System.out.println("cons  G age this keyword use: "+ super.age);//10
		System.out.println("cons  G salary  this keyword use: "+ super.salary);//20.20
	}
}
	


public class Abstractclass3 {

	public static void main(String[] args) {
		finger h1=new finger(10,20.20);
		h1.harshal();
		h1.regu(2);
		h1.bhola(40.10);
		h1.pankaj();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		hand h2=new hand();
		h2.bhola(80.80);
		h2.pankaj();
		h2.harshal();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		hand h3=new finger(40,40.10);
		h3.harshal();
		h3.bhola(50.50);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		 man h4=new hand();	
		 h4.pankaj();			
}
}
/* 
 * Abstract= it is process hiding certain details & showing only essential information to the user
  there are two types to achived abstraction in java
  1.Abstract class
  2.Interface
 1.Abstract class=class which is declared abstract is called Abstract class
 *  Abstract keyword is non acess modifier used for class & method
   3.Abstract class = it can not be instance ( no object created )
   4.Abstract method= it is use only aabstract class.not complete body provided so ,
  it is override to subclass.
 * Abstract class have both abstract & non- abstract method/regular method/concrete method  
 *  
 */



