package methodoverriding;

class animals{
	void display() {
		System.out.println("VOID DISPLAY METHOD ");
	}
}
class tiger extends animals{
	void display() {
		System.out.println("overrriding method samae");
	}
}


public class methodoverrriding1 {

	public static void main(String[] args) {
		animals f1=new animals();//refereance and object both animals
		f1.display();
		System.out.println(".................................");
		animals f2=new tiger();//refereance to animals and object tiger  childclass
		f2.display();
		System.out.println(".................................");
		tiger f3=new tiger();//refereance and object both tigers
		f3.display();
		System.out.println(".................................");
	}

}
/*metho overrridibg=declared method in subclass hich is already declared super class
                   is called method overrriding
                   when method of subclass same method name ,parameter ,return type .
       same in super clas
       metgofd same name ,and parameter also 
      method not use cons
      it is not use final keywords*/
