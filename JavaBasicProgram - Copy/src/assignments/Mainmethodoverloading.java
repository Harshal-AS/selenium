package assignments;

public class Mainmethodoverloading {

	public static void main(String[] args) {
Mainmethodoverloading.main();//direct call because void return type so, direct call to  direct way 

main();//direct call because void return type so, direct call to  direct way 
		//std. way
Mainmethodoverloading.main();
main();

System.out.println("addnum method call int,int: "+Mainmethodoverloading.addnum(10, 20));
System.out.println("addnum method call int int: "+addnum(10, 20));//direct way
		
System.out.println("addnum method call int,double: "+Mainmethodoverloading.addnum(40, 1234.40));
System.out.println("addnum method call int,double: "+addnum(40, 1234.40));//direct way
	}


public static void main() {
	System.out.println("main method overloading");
	
}
static int addnum(int num1,int num2) {
	int res=num1+num2;
	return res;
	
}
static double addnum(int age,double empid) {
	double res=age  + empid;
	return res;
}
}
