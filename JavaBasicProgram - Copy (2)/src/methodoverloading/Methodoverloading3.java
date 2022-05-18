package methodoverloading;

public class Methodoverloading3 {

	public static void main(String[] args) {
		System.out.println(Methodoverloading3.getinterest(40, 500, 80));
	//return valoue change 
		double res=9000.40;
		System.out.println(res);//9000.40
	}
	public static double getinterest(int p,double r,int t) {
		System.out.println(p);//40
		System.out.println(r);//500
		System.out.println(t);//80
		double res=(p*r*t)/100;
		System.out.println("getintrest: "+res);//16000.0
		return  res;////16000.0
		//return change=9000.40
	}
}
//	void getinterest(int p,double r,int t) {
//		double res=(p*r*t);
//		System.out.println(res);
//	}

//METHODOVERLOADING=if class has multiple methods having same name but difffrent set og argument or parameters is called methodoverloading.
//OR
//METHODOVERLOADING=method declared more than one in a class body but different set of oarameter or arguments is called methodoverloading..
//likes:
//	1.type of arguments diff.
//	2.numberof arguments diff.
//	3.position of arguments diff.

