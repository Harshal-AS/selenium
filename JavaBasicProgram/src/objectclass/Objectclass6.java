package objectclass;
class print{
	int a=10;
	public int hashcode() {
		return 50 ;
	}
	public String toString() {
		return ("I am Print Class toString");
	}
	public boolean equals(Object obj) {
		print p=(print)obj;//new Print();
		return (this.a==p.a);
			  //10 == 10
	}
	
}


public class Objectclass6 {
	static int age=50;
	int notebook;
	Objectclass6(){
		 notebook=age;
	}
	

	public static void main(String[] args) {
		
		Objectclass6 s = new Objectclass6();
	System.out.println("s: toString of ObjectClass4: "+s);//Day32String.ObjectClass4@jhuy98798
		System.out.println("s: hashCode of ObjectClass4: "+s.hashCode());//68768757
		
		Objectclass6 s1 = new Objectclass6();
		System.out.println("s1: toString of ObjectClass4: "+s1);//Day32String.ObjectClass4@jhuy98798
		System.out.println("s1: hashCode of ObjectClass4: "+s1.hashCode());//68768757
		System.out.println(s1.equals(s1));//false
		//System.out.println(s==(s1));//false
		print p1=new print();
		System.out.println("toString of Print: "+p1);//I am Print Class toString
		System.out.println("hashCode of Print: "+p1.hashCode());//101
		print p2=new print();
		System.out.println("toString of Print: "+p2);//I am Print Class toString
		System.out.println("hashCode of Print: "+p2.hashCode());//101
		System.out.println(p1==(p2));
//		
//		print p=new print();
//		System.out.println("toString of Print: "+p);//I am Print Class toString
//		System.out.println("hashCode of Print: "+p.hashCode());//101
//		System.out.println("toString of Print: "+p1);//I am Print Class toString
//		System.out.println("hashCode of Print: "+p1.equals(p));//101
//	
	}	
	
}
	