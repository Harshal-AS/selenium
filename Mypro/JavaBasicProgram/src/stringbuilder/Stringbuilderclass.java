package stringbuilder;

public class Stringbuilderclass {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello ");
		sb.append("Java ");// now original string is changed
		System.out.println(sb);// prints Hello Java
		sb.insert(11, "compiler");
		System.out.println("insrt compiler index 9: "+sb);
		sb.reverse();
		System.out.println(sb);// prints avaJ olleH
		StringBuilder sb1 = new StringBuilder("Hello Java");
		System.out.println(sb1);//Hello Java
		StringBuilder sb2 = new StringBuilder("Hello Java");
		System.out.println(sb2);//Hello Java
		System.out.println(sb1.equals(sb2));// address basis comparison
		System.out.println(sb1 == sb2);// address basis comparison
		// We don't have any method in StringBuffer and StringBuilder to compare object
		// values, so to overcome that
		// first convert StringBuffer/StringBuilder to String class using toString()
		// dn use equals() of string class
		System.out.println((sb1.toString().equals(sb2.toString())));//true
		System.out.println((sb1.toString()==(sb2.toString())));//false
		
		
		/*(sb1.toString()==(sb2.toString())= compare two object value
		 * (sb1.toString().equals(sb2.toString())=compare 2 object address
		 * 
		  */
		 
	}
}