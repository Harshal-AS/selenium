package abstract1;
//Abstract class
abstract class Animal {
	// Abstract method (does not have a body)
	 abstract void animalSound();
	// Regular method
	 void sleep() {
		System.out.println("Zzz");
	}
}

//Subclass (inherit from Animal)
class Pig extends Animal {
 void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}
}

//Subclass (inherit from Animal)
class Dog8 extends Animal {
	 void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The dog says: bow bow");
	}
	 void sleep() {
		System.out.println("Zzz");
}
}
class abstractClass {
	 static void main(String[] args) {
		Pig myPig = new Pig(); // Create a Pig object
		myPig.animalSound();
		myPig.sleep();
		Dog8 d1=new Dog8();
		d1.animalSound();
		d1.sleep();
		Animal a1=new Dog8 ();
		a1.animalSound();
		a1.sleep();
		
	}
}




