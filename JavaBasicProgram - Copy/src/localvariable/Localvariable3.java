package localvariable;

public class Localvariable3 {

	public static void main(String[] args) {
		int age=12;
		long pincode=425107;
		float f=12.34f;
		double empid=1234.10;
		char c='A';
		boolean b=false;
		System.out.println("program start");
		System.out.println("age:"+age);//12
		System.out.println("long:"+pincode);//425107
		System.out.println("float:"+f);//12.34f
		
		System.out.println("empid:"+empid);//1234.10
		System.out.println("char:"+c);//A
		System.out.println("boolean:"+b);//FALSE
		// UPDATED VALUE LOCAL VARIABLE
		age=14;
		 pincode=425108;
		 f=14.34f;
		 empid=128.10;
		 c='B';
		 b=true;
		 System.out.println("age1:"+age);//14
			System.out.println("long 1:"+pincode);//425108
			System.out.println("floa 1t:"+f);//14.34f
			
			System.out.println("empid 1:"+empid);//128.10
			System.out.println("char 1:"+c);//B
			System.out.println("boolean 1:"+b);//TRUE
		
		int num1=20,num2=5,result;
		result =num1/num2;
		System.out.println("num1:"+num1);//20
		System.out.println("num2:"+num2);//5
		System.out.println("result:"+result);//4
		
		int  num3=100,num4=40,result1;
		result1 =num3+num4;
		System.out.println(num3);//100
		System.out.println(num4);//40
		System.out.println(result1);//140
		
		int  num5=100,num6=40,result2;
		result2 =num5-num6;
		System.out.println(num5);//100
		System.out.println(num6);//40
		System.out.println(result2);//60
		
		System.out.println("program end");

	}

}
