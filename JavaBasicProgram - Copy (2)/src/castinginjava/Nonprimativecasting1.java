package castinginjava;
class Honda{
	void claame() {          // non primitive casting use only inheritance
		System.out.println("honda");
	}
}
	class Bike1 extends Honda{
		void harshal() {
		System.out.println("subclass bike and super class honda");	
	}
}


public class Nonprimativecasting1 {

	public static void main(String[] args) {
	Bike1 ref=new Bike1();// object of childclass & refrence of childclass
	ref.harshal();
	ref.claame();
	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	Honda ref1=new Honda ();//object of Honda & refrence of Honda 
	ref1.claame();
	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	//Bike1 ref3=new Bike1();
	Honda ref3=new Bike1();
	//ref3.harshal();
	ref3.claame();
	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    Honda v1=ref;//AUTO CASTING /implicit auto cating
    v1.claame();

	}

}
