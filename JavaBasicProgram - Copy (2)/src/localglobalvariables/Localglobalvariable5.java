package localglobalvariables;

public class Localglobalvariable5 {
		static boolean b;
	int empid=78945;

	public static void main(String[] args) {
		int age=12;
		System.out.println("local: "+age);//12
System.out.println("static gv:"+Localglobalvariable5.b);// false std. access static gv=classname.variablename 
System.out.println("static gv:"+b);// false direct access static gv=variable name

Localglobalvariable5 ref=new Localglobalvariable5();
System.out.println("non static gv:"+ref.empid);//78945
//updated non static gv
ref.empid=54987;
System.out.println("non static gv:"+ref.empid);//54987
//initial value non static gv
Localglobalvariable5 ref1=new Localglobalvariable5();
System.out.println("non static gv initial value:"+ref1.empid);//78945
System.out.println("program end");
	}
}
/*Global variable=variable declared outside the method body but present inside class body .
Non  static global variable=variable declared outside the method body but present inside class body without static keywords.	

* non static global variable or instance variable 
1.declared without static keywords
2.knows as instance/object member
3.memory loaded at runtime because instance/object member created the object 
created object 
classname referencenamevariable =new classname ();
4can be access used referencevariable.classname.
refrencevariablename.nonstaticvariablename;
5.nonstatic gv memory location happens multiples based on objects crated */




