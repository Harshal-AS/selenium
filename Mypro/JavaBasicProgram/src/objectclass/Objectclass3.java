package objectclass;

public class Objectclass3 extends A {
	int rollno = 1234;// cons is used this.keyword only diff. between non static gv local gv
	int lastroll;// at same variable

	Objectclass3(int rollno) {
		System.out.println(rollno);// 1234
		this.rollno = rollno;

		System.out.println(this.rollno);
	}

	public static void main(String[] args) {
		Objectclass3 r1 = new Objectclass3(4321);//
		System.out.println(r1);
		System.out.println(r1.toString());
		System.out.println(r1.hashCode());
		A r2 = new A();
		System.out.println(r2);
		System.out.println(r2.toString());
		System.out.println(r2.hashCode());

	}

}
