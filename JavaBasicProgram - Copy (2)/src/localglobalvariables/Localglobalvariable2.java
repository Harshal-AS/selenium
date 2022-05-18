package localglobalvariables;

public class Localglobalvariable2 {
static float f=10.20f;
static double salary=60000;

	public static void main(String[] args) {
	int age =60,empid=456789;
	System.out.println("local variable:"+age);//60
	System.out.println("local variable:"+empid);//456789
	//updated local variable
	age=10;
	System.out.println("local variable updated age:"+age);//updated 10
	empid=80000;
	System.out.println("local variable updated salary:"+empid);//udated 80000
	//static global variable access
	System.out.println("static globalvariable:"+f);//10.20 direct way to access
	System.out.println("static globalvariable:"+salary);//60000 direct way to access
	System.out.println("static globalvariable:"+ Localglobalvariable2. f);// 10.20std.way to access 
	System.out.println("static globalvariable:"+ Localglobalvariable2 .salary);//60000 std.way to access 
	//updated static variable
	Localglobalvariable2.f=20.10f;
	Localglobalvariable2.salary=65000;
	System.out.println("static global variable updated float:"+ Localglobalvariable2. f);// 20.10std.way to access 
	System.out.println("static global variable updated salary :"+ Localglobalvariable2 .salary);//65000 std.way to access 
	
	}

}
