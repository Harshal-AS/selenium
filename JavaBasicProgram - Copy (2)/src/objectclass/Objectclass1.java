package objectclass;

class A {
	static int age = 12;
	int salary = 1000;
	int rollnumber;

	A() {
		rollnumber = salary;

	}
}

public class Objectclass1 {

	public static void main(String[] args) {
		A ref = new A();
		System.out.println(ref);// to string=representation of an object to used convert object
		// to string
		System.out.println(ref.toString());
//fully classified name (tostring)=packagename.classname
		System.out.println(ref.toString());// to string=representation of an object to used convert object to string
		// hashcode convert hexadecimal to decimal
		System.out.println(ref.hashCode());

	}

}
