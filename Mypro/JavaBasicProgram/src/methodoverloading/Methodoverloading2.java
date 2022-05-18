package methodoverloading;

public class Methodoverloading2 {
	float r=40.10f;
	static int empid=987654;

	public static void main(String[] args) {
		int empid=98754;
		float b=70.10f;
		System.out.println("local variable empid:"+empid);//98754
		System.out.println("local variable b:"+b);//70.10
		System.out.println("static gv empid: "+Methodoverloading2.empid);//987654
		//non static 
		Methodoverloading2 g1=new Methodoverloading2();
		System.out.println("non static gv:"+g1.r);//40.10
		Methodoverloading2.harshal();//defaultvalue 0
		System.out.println("static gv method harshsl: "+Methodoverloading2 .kunal(70, 70000));
		double res=90000.40;//return value change 
		System.out.println("return value change:"+res);//90000.40
		g1.kunal();//no parameter
		System.out.println("nonstatic methoda name additon:"+g1.addition(90, 100));//190
		int res1=900;//return value change
		System.out.println("return value vchange addition method:"+res1);
	}
	static void harshal() {
		 System.out.println("hi harshal");
	 }
		static double kunal(int num1,double salary) {
			double res=num1+salary;//70,70000
			return res;//
		}
		 void kunal() {
			System.out.println("jaggu no paremeter pass");
		}
		 int addition(int num1,int num2) {
			int res=num1+num2;
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

