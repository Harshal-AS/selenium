package stringbuffer;

public class Stringbuffer {

	public static void main(String[] args) {
		// String a="hi";

		StringBuffer stbu = new StringBuffer("hi");
		System.out.println(" growable length:" + stbu.length());// 2
		System.out.println("original stringbuffer value: " + stbu);// hi

		stbu.append("Java ");// orignal string is changed
		System.out.println("orignal string is changed: " + stbu);// hiJava

		stbu.insert(6, "programmer");
		System.out.println("orignal string is changed: " + stbu);// hiJavaprogrammer

		stbu.replace(2, 6, "Comiple at ");
		System.out.println("2 to 6 index replace whatapp: " + stbu);// hiComiple at programmer
		stbu.delete(0, 2);
		System.out.println("delete 0 to 2 index: " + stbu);// Comiple at programmer

		StringBuffer ref2 = new StringBuffer("Happy birthday bro");
		System.out.println("growalbe length:" + ref2.length());
		ref2.reverse();
		// System.out.println("reverse string element: "+ref2.reverse());
		System.out.println("reverse string element: " + ref2);

		StringBuffer ref3 = new StringBuffer();
		// ref3.capacity();
		System.out.println(" string buffer index capacity: " + ref3.capacity());// default 16
		ref3.append("Core");
		System.out.println("append : " + ref3);
		System.out.println(" string buffer index capacity: " + ref3.capacity());// 16
		ref3.append("Basic java");
		System.out.println("append : " + ref3);
		System.out.println(" string buffer index capacity: " + ref3.capacity());// 16
		ref3.append(" at compile time");
		System.out.println("append : " + ref3);
		System.out.println(" string buffer index capacity: " + ref3.capacity());// 34
		ref2.append("COMPILER");
		System.out.println(" string buffer index capacity: " + ref3.capacity());// 34
      // old (capacity*2)+2=value
	}
}


/*string class = string length fixed bu stringbuffer class =growablelength
 *StringBuffer=It is ued to created mutable string object.
 *it is similar to string class but string buffer mutalbe
 *mutable== it is changed the value 
 * 
 */
