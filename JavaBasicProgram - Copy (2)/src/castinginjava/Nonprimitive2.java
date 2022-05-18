package castinginjava;
class A{
	void a1() {
		System.out.println("parents a");
	}
}
class B extends A{
	void a2() {
		System.out.println("B SUBCLASS A PARENTS CLASS");
	}
}
class C extends B{
	void a3() {
		System.out.println("C SUBCLASS B PARENTS CLASS");
}
}
public class Nonprimitive2 {

	public static void main(String[] args) {
		C z1=new C ();//reference & object of childclass C
		z1.a3();
		z1.a2();
		z1.a1();
        B z2=new B ();//reference & object of childclass B
        z2.a2();
        z2.a1();
        // auto upcating or implicit casting
        B z3 =new  C ();// auto up casting>>>java compiler convert into>>>>B z3=(B) new C() ;       
        z3.a2();
        z3.a1();
       C z4=new C ();
       B v1=z4;//implicit up casting
       B z6=(B)z4;//explicit up casting
       B z5=(B)new C();//explicit up casting
       B z7=new B ();
       A v2=z7;
       A v3=(A) z7;
       A v4=(A)new B();
       
        
}
}
/**
* child class object referred by any of its parent known as up casting

* parent class object referred by any of its child class known as downcasting
  directly downcasting is not possible in java

Child c2=new Parent();//downcasting but not possible in this way

Parent p1=new Child();

Child c1=(Child)p1;//downcasting, as Upcasting object is getting down casted here
 */
