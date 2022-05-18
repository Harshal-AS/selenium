package methodoverriding;


class father {
	static void display() {
	System.out.println("static method declared");
}
	void display2 () {
		System.out.println("static method declared");
	}
		
}
class harshal extends father {
	static void display() {
		System.out.println("static method declared");
	}
		void display2 () {
			System.out.println("static method declared");
		}
				}



public class Methodoveriding2 {

	public static void main(String[] args) {
		 father h1=new  father();
		 h1.display2();
		 father .display();
		 System.out.println(".................................");
		 father h2=new  harshal();//ref father and object created harshal
		 h2.display2();
		 father .display();

	}
	

}
