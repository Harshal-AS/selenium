package immutableclass;

final class Immutable{
	final String name;
	final boolean b;
	final static int age=12;
	Immutable(String s,boolean na){
		name=s;
		b=na;
	}
		// getter method use 
		public String  har() {
			return name;
		}
		public boolean shital() {
			return b;
			
		}
		}
	
public class Immutableclss {

	public static void main(String[] args) {
		System.out.println(" final static member: "+Immutable.age);
		Immutable ref=new Immutable("harshal",false);
		System.out.println(" final non static data member string: "+ref.har());
		System.out.println(" final non static data member boolean : "+ref.shital());
		// change the final  data variable value created new object because immutable 
		Immutable ref1=new Immutable("pankaj ",true);
		System.out.println(" final non static data member string: "+ref1.har());
		System.out.println(" final non static data member boolean : "+ref1.shital());
	
	}
}
/*Immutable class= 1)there are many immutable class likes,String ,boolean float,
 double,char,int,byte,short.
 2)In short wrapper class & string class is immutable.
 3)we can also created immutable class.
 Immutable class crated 
 a)class & data member are declared as final.
 b)cons should be parameterized that initilized the final data  variable value.
 c)only getter method use to get the final data variable value
 
*/
