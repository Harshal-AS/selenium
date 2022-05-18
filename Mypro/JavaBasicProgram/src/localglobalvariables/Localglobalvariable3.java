package localglobalvariables;

public class Localglobalvariable3 {
static boolean f;//value not initilized the default value zero
static double salary;//value not initilized the default value zero

	public static void main(String[] args) {
		int age=12;
		float f=40.50f;
		double salary =4210.10;//local variable initilized otherwise the garbage value store
		System.out.println("local variable:"+age);//12
		System.out.println("local variable:"+f);//40.50
		System.out.println("local variable:"+salary);//4210.10
		//static gv not initilized so deault value zero store 
		System.out.println("static global  variable:"+Localglobalvariable3.f);// 0 std way to acess
		System.out.println("lstatic global  variable:"+Localglobalvariable3.salary);// 0 std way to acess
		
		
	}
}


/*static global variable= variable declared outside the method body but present inside class body with static keywords.
Global variable =variable declared outside the method body but  present inside class body .

Static global variable or class variable.

1.declared with static keyword.
2.class variable or class member
3.Memory loaded at the compile time because they are class variable or class member or static gv
4.can be acess using  classname or directly access inside the static gv.
acess to std
classname.staticglobalvariable
5.static gv  memory location happens only once .*/