package methods;

public class Method1 {

	public static void main(String[] args) {
		harshal();
		Method1 ref=new Method1();
		ref.aaru(10);//void not return value so direct call to mrthod
		System.out.println(ref.sona(20, 1234));//return value so the use the syso method call
		System.out.println(ref.jaggu(40, 7894, 4120.10));
		//return value change 
	double res=4656784.10;
	System.out.println("return value change the jaggu method:"+res);//int variable =value =syso (variable )
		
		
		

	}


public static void harshal() {//0
	
}
public  void aaru(int age) {
	System.out.println("aaru:"+age);//10
	
}
double sona(int age,double empid) {
	double res=age+empid;
	System.out.println("sona1:"+age);//20
	System.out.println("sona2:"+empid);//1234
	System.out.println("sona3:"+res);//1254

	return empid;//1234
}
	double jaggu(int age,int empid,double salary) {
		System.out.println("jaggu1:"+age);//40
		System.out.println("jaggu2:"+empid);//7894
		System.out.println("jaggu3:"+salary);//4120.10
		double res=age +empid+salary;//41
		System.out.println("jaggu4:"+res);//12054.10
		
		 
		return res;//12054.10
		
	}
}
//methos= method inside the class body to write repeateted statement to method body.
/*static global variable= variable declared outside the method body but present inside class body with static keywords.
Global variable =variable declared outside the method body but  present inside class body .

Static global variable or class variable.

declared with static keyword.
class variable or class member
Memory loaded at the compile time because they are class variable or class member or static gv
can be acess using  classname or directly inside the static gv.
acess to std
classname.staticglobalvariable
sratic gv  memory location happens only once .*/
