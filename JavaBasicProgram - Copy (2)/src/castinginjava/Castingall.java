package castinginjava;

public class Castingall {

	public static void main(String[] args) {
		//primitive not used the char & boolean.
		byte a=12;
		byte l=(byte)a;
		short b=a;//widening casting .1.implicit 2.explicit
		short k=(short)a;
		int c =a;//implicit
		int g=(int) a;
		long d=a;//implicit
		long h=(long)a;
		float e=a;//implicit
		float i=(float)a;
		double f=a;//implicit
		double j=(double)a;//explicit
		// implicit casting widening lower to higher data type
		System.out.println("primitive  widening type imlicit explicit conversion.....");
		System.out.println("primitive widening type implicit casting:"+a);	
		System.out.println("primitive widening type implicit casting:"+b);	
		System.out.println("primitive widening type implicit casting:"+c);	
		System.out.println("primitive widening type implicit casting:"+d);	
		System.out.println("primitive widening type implicit casting:"+e);	
		System.out.println("primitive widening type implicit casting:"+f);
		// explicit casting widening lower to higher data type
		System.out.println("primitive narrowing type explicit casting:"+l);
		System.out.println("primitive narrowing type explicit casting:"+k);	
		System.out.println("primitive narrowing type explicit casting:"+g);	
		System.out.println("primitive narrowing type explicit casting:"+h);	
		System.out.println("primitive narrowing type explicit casting:"+i);	
		System.out.println("primitive narrowing type explicit casting:"+j);	
		
	System.out.println("primitive  narrowing type only  explicit conversion.....");
	System.out.println(",.,,,,,,,,,,,,,,...................");
	// primitive narowing type casting ( only explicit possible not implicit )
	double y=10.10;
	double x=(double)y;
	float x1=(float)y;
	long x2=(long)y;
	int x3 =(int)y;
	short x4=(short)y;
	byte x5=(byte)y;
	System.out.println("primitive widening type explicit casting:"+y);	
	System.out.println("primitive widening type explicit casting:"+x);	
	System.out.println("primitive widening type explicit casting:"+x1);
	System.out.println("primitive widening type explicit casting:"+x2);
	System.out.println("primitive widening type explicit casting:"+x3);
	System.out.println("primitive widening type explicit casting:"+x4);	
	System.out.println("primitive widening type explicit casting:"+x5);

	}
	

	}

	
/* casting compiler only homogenus statement sometime ew can also use hemetrogenous 
 statement
 * 1.int age =12;( LHS=RHS mean it homogenous statement 
 * 2.double empid=123;( LHS IS NOT EQUAL TO RHS) it is hetrogenous statement
 types of casting= it is process that convert one datatype to another datatype
 in both ways automatically and manually
 1.Automatic conversion is done by the compiler
 2.Manually conversion is done by the programmer
 NOTE= USE THE CASTING DATA NOT MODIFIED ONLY 1 DATA TYPE MODIFIED
 THERE ARE 2 TYPES OF CASTING
 1.PRIMITIVE CASTING
 2.NON-PRIMITIVE CCASTING
 
 1.PRIMITIVE CASTING=CONVERT LOWER DATA TYPE INTO HIGHER DATATYPE ONEIS CALLED PC
 DATATYPE CONVERSION BOTH WAY IMPLICIT  EXPLICIT (IMPLICIT= AUTOMATIC & EXPLICIT=MANUALLY
 IMPLICIT SYNTAX
 DATATYPE VARIABLENAME=VALUE;
 EXPLICIT SYNTAX
 DATATYPE VARIABLENAME =DATATYPE VALUE;
 
 
 2.NON-PRIMITIVE CCASTING=CONVERT HIGHER DATATYPE TO LOWER DATA TYPE IS CALLED NON PC
 DATATYPE CONVERSION ONLY EXPLICIT= MANUALLY
 EXPLICIT SYNTAX
 DATATYPE VARIABLENAME =DATATYPE VALUE;
 */



