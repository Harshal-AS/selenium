package inteface;
interface Z{
	static int b=45;//variable use inteface and also method no cons use
	double empid=4521.45;
	public void harshal();//by defaut public abstract  
}
class Y implements Z{
	double salary=1234.10;
	static int ag=10;
	public void harshal() {
		System.out.println("abstract1 method ");
	}
	public double addition(int num1,double salary) {
		double res=num1+salary;
		return res;
	}
}

public class Interface3 {

	public static void main(String[] args) {
	Y j1=new Y();
	j1.harshal();
	System.out.println("method returm value :"+j1.addition(12, 100.20));
	System.out.println(" static gv :"+Z.b);
	System.out.println(" static gv :"+Y.ag);
	System.out.println("non static gv :"+j1.empid);
	System.out.println(" non static gv :"+j1.salary);

	}

}
