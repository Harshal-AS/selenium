package castinginjava;
class Aarav{
	void harshal1() {
		System.out.println("hi harsha l");
	}
}
class Pranjal extends Aarav{
	void harshal2() {
	System.out.println("hi harshal 2");
}
}
class Hemant extends Pranjal{
	static void harshal3(int age) {
		System.out.println("parameter pass age harshal 3 ");
	}
}

public class Nonprmitive3 {

	public static void main(String[] args) {
		Pranjal s1=new Hemant ();//upcasting automatic  upcasting or implicit casting
		Aarav s2=new Pranjal();//upcasting automatic  upcasting or implicit casting
		
		
		
		//object created childclass to ref childclass
		Hemant s3=new Hemant();
		Hemant.harshal3(40);
		s3.harshal2();
		s3.harshal1();
		//object created childclass to ref childclass
		Pranjal s4=new Pranjal();
		s4.harshal2();
		s4.harshal1();
		//downcasting
		 Hemant s5=(Hemant)s1;
		 Pranjal s6=(Pranjal)s2;
		 
		
		
		
	
	}

}
