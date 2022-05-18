package methods;

public class Method3 {

	public static void main(String[] args) {
		//Method3.harshal();//classname.methodname
		harshal();//direct methodname 
		 System.out.println(harshal1(10,20));//direct methodname 
		// System.out.println(Method3.harshal1(10,20));//classname.methodname
		 Method3 ref=new Method3 ();
		 ref.jaggu(50);
		 System.out.println(ref.jaggu1(70, 800.10, 90));
		 System.out.println(ref.addition(100, 200, 400.20));
		 //updated value
		 double res=800.40;
		 System.out.println("return value change the addition method: "+res);  
		// double rvalue=ref.callD(41015);//it will be executed and storing return value in variable for future use
		//	System.out.println(rvalue);
			
		
	}
	static void harshal() {
		System.out.println("hi harshal");//
	}
	
	 public void jaggu(int num1) {
		 System.out.println("jaggu num1: "+num1);//50
		 
		 
	 }
	 static int harshal1(int num1,int num2) {
		 System.out.println("harshal1: "+num1);//10
		 System.out.println("harshal1: "+num2);//20
		 int res=num1+num2;
		 System.out.println("harshal1: "+res);
		 return res;//30
		
	 }
	 double jaggu1(int num1,double salary,int num3) {
		 System.out.println("jaggu1: "+num1);//70
		 System.out.println("jaggu1: "+salary);//800.10
		 System.out.println("jaggu1: "+num3);//90
		 
		double res=num1+salary+num3;
		System.out.println("jaggu: "+res);//960.10
		 return res;//960.10
		 
	 }
	 public double addition(int num1,int num2,double empid) {
		 System.out.println("addition: "+num1);//100
		 System.out.println("addition: "+num2);//200
		 System.out.println("addition: "+empid);//400.20
			
		 double res=num1+num2+empid;
		 System.out.println("addition: "+res);//700.20
		 return res;//700.20
	 }
	

}
	 
