package localglobalvariables;

public class Localglobalvariable1 {
	static double  empid=1224;
	static int age=40;

	public static void main(String[] args) {
		int age =12;
		int empid=4567;
		System.out.println("local variable:"+age);//12
		System.out.println("local variable:"+empid);//4567
		
		//stastic global variable two types of acess but same variable method body so,jvm firest check the the method body means local variable 
		//local & global variable same static dtd.way to acess ortherwise no acess to static global variable
		//std.way to acess= classname.variablename;
		// direct way to acess= variablename;
		System.out.println("static global variable:"+age);// 12 direct way to acess
		System.out.println("static global variable:"+empid);// 4567 direct way to acess
		System.out.println("static global variable:"+Localglobalvariable1.age);//40 std. way to acess
		System.out.println("static global variable:"+Localglobalvariable1.empid);//1224 std. way to acess
		
		//global variable=variable declared outside the method body but present inside class body .
		// static global variable=variable declared outside the method body but present inside class body with static keywords.
	}

}
