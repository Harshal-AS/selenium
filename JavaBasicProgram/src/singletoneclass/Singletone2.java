package singletoneclass;

class Singletone {

	
		// Constructor of this class, Here private constructor is is used to restricted to this class itself
		private Singletone() {
			s = "Hello I am a string part of Singleton class";
		}

		// Static variable single_instance of type Singleton
		private static Singletone single_instance = new Singletone();
		// Declaring a variable of type String
		public String s;

		// Method Static method to create instance of Singleton class
		public static Singletone getInstanceOfSingleton() {
			// To ensure only one instance is created
			return single_instance;
		}
	}

	public class Singletone2 {
		// Main driver method
		public static void main(String args[]) {
			
			//Singleton s1=new Singleton();// can't create an object of Singleton class as its constructor is declared as private
			
			// Instantiating Singleton class with variable x
			Singletone x = Singletone.getInstanceOfSingleton();
			System.out.println("String from x is: " + x.s);
			// Instantiating Singleton class with variable y
			Singletone y = Singletone.getInstanceOfSingleton();
			System.out.println("String from y is: " + y.s);
			// instantiating Singleton class with variable z
			Singletone z = Singletone.getInstanceOfSingleton();
			System.out.println("String from z is: " + z.s);
			// Now changing variable of instance x via toUpperCase() method
			System.out.println("**********After converting to upper case*********");
			x.s.toUpperCase();
			// Print and display commands
			System.out.println("String from x is: " + x.s);
			System.out.println("String from y is: " + y.s);
			System.out.println("String from z is: " + z.s);
			System.out.println("\n");
			// Now again changing variable of instance x
			System.out.println("**********After converting to lower case*********");
			x.s = (x.s).toLowerCase();
			System.out.println("String from x is: " + x.s);
			System.out.println("String from y is: " + y.s);
			System.out.println("String from z is: " + z.s);
		}
	}
	/* Single tone=it is only one instance should be created & single object used to all other classes
	 Single tone class refer below points 
	  *1. create class cons private.
	  *2.create static instance of current class.
	  *3. create static method which  should be return object of current class
	 * 
	 * */
