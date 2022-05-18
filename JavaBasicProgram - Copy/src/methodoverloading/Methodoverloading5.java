package methodoverloading;

public class Methodoverloading5 {
static int age=12;
double salary;
	public static void main(String[] args) {
		int age=11;
		double salary=80000;
		System.out.println("local variable age:"+age);//11
		System.out.println("local variable empid:"+salary);//80000
		//global variable
		System.out.println("static gv:"+ Methodoverloading5.age);//12
	 Methodoverloading5 h1=new  Methodoverloading5();
	 System.out.println("non static gv:"+h1.salary);//0
	 h1.harshal();
	 Methodoverloading5.harshal(70);
	 System.out.println(Methodoverloading5.harshal(90,45000));
	 System.out.println(h1.harshal(80, 70, 60));
	System.out.println(h1.harshal(60, 50, 500.10, 20));
	//return value change
	double res=2000.10;
	System.out.println("return value change:"+res);
	 
	 
}
	 void harshal() {
		 System.out.println("hi good morning harshal");//no parameter pass
		
	}
	 static void harshal(int a) {
		 System.out.println("harshal1:"+a);//70
	 }
	
	static double   harshal(int a,double b) {
		double res=b-a;
		System.out.println("a-b res:"+res);
		return res;
		
	}
	public  int  harshal(int a,int b,int c) {
		int res=a+b+c;
		System.out.println("a+b+c res:"+res);
		
		return res;
		
	}
	double harshal(int a,int b,double c,int d) {
		double res=a+b+c+d;
			System.out.println("a+b+c+d:"+res);
			return res;
		
	}
	
	

}
//METHODOVERLOADING=if class has multiple methods having same name but difffrent set og argument or parameters is called methodoverloading.
//OR
//METHODOVERLOADING=method declared more than one in a class body but different set of oarameter or arguments is called methodoverloading..
//likes:
//	1.type of arguments diff.
//	2.numberof arguments diff.
//	3.position of arguments diff.

