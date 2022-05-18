package localglobalvariables;

public class Localglobalvariable4 {
	
	double salary=4510.10;// non static global variable
	int empid =12300;// non static global variable
	static int age=12;// static global variable
	

	public static void main(String[] args) {
		int age =40;
		int empid =123;
		System.out.println("local: "+age);//40
		System.out.println("local: "+empid);//123
		//updated local variable
		age=30;
		empid=321;
		System.out.println("local updated : "+age);//30
		System.out.println("local updated : "+empid);//321
		//static gv
		System.out.println("static gv :"+ Localglobalvariable4 .age);//12 std. way to acess
		//updated static gv
		Localglobalvariable4.age=21;//updated static gv =classname.variablename
		System.out.println("static gv updated :"+ Localglobalvariable4 .age);// 21
		//non static gv created object 
		//classname ref =new classname ();
		Localglobalvariable4 h1=new Localglobalvariable4();
		System.out.println("non static gv:"+h1.salary);//4510.10
		System.out.println("non static gv:"+h1.empid);//12300
		//updated non static gv
		h1.salary=4120.10;
		System.out.println("non static gv updated: "+h1.salary);//4120.10
		h1.empid=123789;
		System.out.println("non static gv updated: "+h1.empid);//123789
		
		//initial value of non static gv =created new object 
		Localglobalvariable4 h2=new Localglobalvariable4();
		System.out.println("non static gv initial value :"+h2.salary);//4510.10
		System.out.println("non static gvvalue :"+h2.empid);//12300
		
		
	}

}
