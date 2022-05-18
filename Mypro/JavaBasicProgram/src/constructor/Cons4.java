package constructor;

public class Cons4 {

	int roll;
	double salary;
	Cons4(int r,double s){
		roll=r;
		salary=s;
		
	}
	void display() {
		System.out.println(roll + " " + salary);
	}
	public static void main(String args[]) {
		Cons4 c1 = new Cons4(101,250045.45);//
		System.out.println(c1.roll);//504
		System.out.println(c1.salary);//251145.45
		//c1.display();//0.504
		Cons4 c2 = new Cons4(201,550045.45);//
		System.out.println(c2.roll);
		System.out.println(c2.salary);
		
		c2.display();
	}
}		

	


