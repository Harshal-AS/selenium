package encapsulation;
class y2{
	private  int age=78;
	private double empid=10000;
	// setter method use only for the write 
	public void setl(int l) {	
		 l= age;
	}
	
	public void set2(double k){	
		empid=k;	
	}
}

public class Writeonly {

	public static void main(String[] args) {
		y2 b1=new y2();
		b1.setl(12);
		b1.set2(200000);
		//System.out.println("setter mwthod set1: "+b1.setl());
		//.out.println("setter mwthod set2: "+b1.set2());
	}
}
		/* setter method not updated baecause not acess the private variable 
		outside the class.
		* 1.Setter method helps to modify or update the value private variable 
		* 2.declared with public
		* 3.return type of setter method void 
		* 4.parameter datatype setter method  should be same as private variable 
		*/

	


