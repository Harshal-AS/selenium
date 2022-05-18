package finalkeywords;

 class finalkeyword{
	 final int age=7;// any variable declared with final keyword should initialize at the same time

	 final static double salary=1234.10;
	final void harshal(int age) {
		System.out.println("hi harshal");
	}
	
	
}


public class Finalkeywords1 {
	public static void main(String[] args) {
		final int age=6;
		System.out.println("local variable "+age);
		System.out.println("static gv:"+ finalkeyword.salary);
		
		finalkeyword t1=new finalkeyword();
		System.out.println("non static gv: "+t1.age);
		t1.harshal(5);
	}

}
//final keywords is a non access modifier are used to variables,method,classes,
//which makes then non-changeble
///**
//variable,method ,class declared with final keyword known as constant
// any variable declared with final keyword should initialize at the same time
