package methods;

public class Method2 {

	public static void main(String[] args) {
//	Method2.getintrest(100, 410.20, 400);
//System.out.println(Method2.getintrest(100, 410.20, 400));
//	}
//	static double getintrest(int p,double r,int t) {
//		
//		double res=(p*r*t)/100;
//		System.out.println("get interest: "+res);
//		return r;
		Method2 ref=new Method2 ();
		ref.getintrest(100, 410.20, 400);
	}
	public void getintrest(int p,double r,int t) {
		double res=p*r*t/100;
		System.out.println("getinterest:"+res);
	}
}

	/*	methods= method inside the class body to write repeateted statement to method body.
		Methods havings 3 important way
		way-1=given method viod so direct call to method (static=methodname(parameter pass))(non static=ref.methodname(parameter pass))
		way-2=the given method return value so use the syso.(static=methodname(parameter pass))(non static=ref.methodname(parameter pass))
		way-3=the return value change 
				e.x int age ;
		syso(parameter pass);*/



