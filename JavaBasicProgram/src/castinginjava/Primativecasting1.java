package castinginjava;

public class Primativecasting1 {

	public static void main(String[] args) {
	byte a=8;
	short b=a;
	short b1=(short)a;
	int c=a;
	int c1=(int)a;
	long d=a;
	long d1=(long)d;
	float e=a;
	float e1=(float)e;
	double f=a;
	double f1=(double)e;
	System.out.println("...widening casting given below..........");
	System.out.println("byte to short homogenous casting:"+a);
	System.out.println("byte to short implicit:"+b);
	System.out.println("byte to short explicit:"+b1);
	System.out.println("byte to int implicit:"+c);
	System.out.println("byte to int explicit:"+c1);
	System.out.println("byte to long implicit:"+d);
	System.out.println("byte tolong explicit:"+d1);
	System.out.println("byte to float implicit:"+e);
	System.out.println("byte tofloat explicit:"+e1);
	System.out.println("byte to double implicit:"+f);
	System.out.println("byte to double explicit:"+f1);
	System.out.println("...only narrowing casting given below..........");
	double z1=400.10;
	float z2=(float)z1;
	long z3=(long)z1;
	int z4=(int)z1;
	short z5=(short)z1;
	byte z6=(byte)z1;
	System.out.println("double to double:"+z1);
	System.out.println("double to float explicit:"+z2);
	System.out.println("double to long explicit:"+z3);
	System.out.println("double to int explicit:"+z4);
	System.out.println("double to shoet explicit:"+z5);
	System.out.println("double to byte explicit:"+z6);
	// narrowing no use the implicit
	
	}

}
