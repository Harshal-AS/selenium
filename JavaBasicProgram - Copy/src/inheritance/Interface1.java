package inheritance;

class fourwheeler{
	fourwheeler() {
		System.out.println("maruti class cons");
	}

	public void tye() {// normal method
		System.out.println("maruti suzuki class name");
	}
}

class car extends fourwheeler {// subclss or childclass=cars/superclass or parentd class=maruti
	car() {
		System.out.println("default cons cars class compile by java compiler");
	}

	public void harshal() {
		System.out.println("hi harshal cars childclass and maruti parentsclass");
	}
}
	class maruti extends car{
		 maruti() {
			System.out.println("patrs class cons");
		}

		public void partsc() {// normal method
			System.out.println("maruti suzuki class name");
		}
	}



public class Interface1 {

	public static void main(String[] args) {
		 maruti ref = new  maruti();// object of childclass
		ref.harshal();// call method to childclass
		ref.tye();// call method to parent class
        ref.partsc();
        
	}
}
/**
add debug point in the required line
f6---> next line or you want to execute current line
f5---> if you want to go inside the called method
f8---> continue

*/
