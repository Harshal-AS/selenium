package string;

public class Stringclass1 {

	public static void main(String[] args) {
		Stringclass1 s1 = new Stringclass1();
		System.out.println(" s1: " + s1);// String representation of an object because of toString()'
		System.out.println(" s1: " + s1.toString());//fully classified
		System.out.println(" s1: " + s1.hashCode());
		// string class object creation ,[ fully classified
		// object=packagename.classname@]
		// using literal
		String s2 = "Surat";// new object will be create in string constant pool
		String s3 = "Surat";// no object will be create as its a duplicate object, so 's3' will points to
							// 's2' object
		String s4 = "Pune";// new object will be create in string constant pool

		// object value because toString() is overrided in String class
		System.out.println("s2: " + s2);// Surat
		System.out.println("s3: " + s3);// Surat
		System.out.println("s4: " + s4);// Pune

		System.out.println("s2 char count :" + s2.length());// 5
		System.out.println("s3 char count :" + s3.length());// 5
		System.out.println("s2 char count :" + s4.length());// 4

		/**
		 * Outside String class: == --> compare two values .equals(obj) --> compare two
		 * objects based on there address Inside String class: == --> compare two
		 * objects based on address .equals(obj) --> compare two objects based on value
		 */

		System.out.println(" s2 & s3 compare adress s2==s3: " + s2 == s3);// true
		System.out.println(" s2 & s3 compare value s2.equal(s3): " + s2.equals(s3));// false

		System.out.println(" s2 & s4 compare adress s2==s4: " + s2 == s4);// false
		System.out.println(" s2 & s4 compare value s2.equal(s4): " + s2.equals(s4));// false

		String s5 = new String("Surat");// two objects--> 1. in constant pool 2. in non-constant pool
		System.out.println("s5: " + s5);
		System.out.println(" s2 & s5 compare adress s2==s4: " + s2 == s5);// false
		System.out.println(" s2 & s5 compare value s2.equal(s4): " + s2.equals(s5));// true

		String s6 = new String("Surat");// two objects--> 1. in constant pool 2. in non-constant pool
		System.out.println("s5: " + s6);
		System.out.println(" s2 & s6 compare adress s2==s4: " + s2 == s6);// false
		System.out.println(" s2 & s6 compare value s2.equal(s4): " + s2.equals(s6));// true
		
		
		String s7 = new String("Nashik");// two objects--> 1. in constant pool 2. in non-constant pool
		System.out.println(" s2 & s7 compare adress s2==s4: " + s2 == s7);// f
		System.out.println(" s2 & s7 compare value s2.equal(s4): " + s2.equals(s7));//f
		
		
	}

}
/**
String-->	
		predefined class in java belongs to java.lang package 
		it represents group/collection of characters
		In String class following methods are override
				1. toString() --> instead of printing string representation of object it will print value stored 
								  inside the string object
				2. equals()   ---> overrided 
				3. hashCode()
		We can create String class object in two ways
			1. by using new keyword
						---> object will be stored in non constant pool
						---> by using this we can have duplicate object also
			2. by using literal 
						---> object will be stored in String constant pool(inside heap)
						---> by using this we can create only unique object inside the pool
*/
