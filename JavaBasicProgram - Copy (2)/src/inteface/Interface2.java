package inteface;
interface A{
	int age=12;
	public void harhsal();
	
}
interface B {
	double salary=1234;
	public void harhsal1();
}
interface C extends A,B {//3 INTERFACE USE THE EXTENDS 
	float f=10.40f;
	public void harhsal2();

}

public class Interface2 {

	public static void main(String[] args) {
		
		//NO OBJECT CREATED BECAUSE THREE USER INTERFACE SO NOT USE THE ACESSS ANY BODY IN PACKAGE 

}
}
