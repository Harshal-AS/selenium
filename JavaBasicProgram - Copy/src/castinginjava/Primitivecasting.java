package castinginjava;

public class Primitivecasting {

	public static void main(String[] args) {
		int age=13;
		double salary=age;//implicit automatic conversion java compiler at compile time
		double salary1=(double)age;// manual conversion written by programmer 
		System.out.println(age);
		System.out.println(salary);
		System.out.println(salary1);
		System.out.println(".............///////////////");
		// the above statemens widening casting
		// widening convert lower datatype to higher one is called widening
		double a=1234;
		int b=(int)a;// the explicit (manual) not use the implicit(automatic) in narrowing
		System.out.println(a);
		System.out.println(b);
		// the above statement narrowing 
		// the narrowing convert higher datatype to lower one.
	}

}
