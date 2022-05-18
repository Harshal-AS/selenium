package methodoverloading;

public class Mainmethodoverloading2 {

	public static void main(String[] args) {
		 Mainmethodoverloading2.main();//std.way
		 main();//direct way
		
		 Mainmethodoverloading2.main();//std.way
		 main();//direct way
		 //return type call to print ln
		 System.out.println("addnum method call int,int: "+Mainmethodoverloading2.addnum(10, 20));
		 System.out.println("addnum method call int,int: "+addnum(10, 20));
		 //std. way
		 System.out.println("addnum method call int,int: "+Mainmethodoverloading2.addnum(10, 100.10));
		 System.out.println("addnum method call int,int: "+addnum(10,100.10));//direct way 
	}
	public static void main() {
		System.out.println("main method overloading");
	}
	static int addnum(int num1, int num2) {
		int res=num1+num2;
		System.out.println("add res num1+num2:"+res);
		return res;	
	}
	static double addnum(int age, double salary) {
		double res=age+salary;
		System.out.println("add res age+salary:"+res);
		return res;
	}

}
