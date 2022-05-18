package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Arraylist2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		list.add("zebra");
		list.add("potato");
		list.add("bringle");
		list.add("chilis");
		System.out.println("size of element: " + list.size());
		System.out.println("list  of element: " + list);// explicit
		// or
		// System.out.println("list of element: "+list.toString());//explicit
		// adding the object elements
		list.add("tomato");
		System.out.println("size of element: " + list.size());
		System.out.println("list  of element: " + list.toString());

		list.remove("bringle");// remove list of element
		System.out.println("size of element: " + list.size());
		System.out.println("list  of element: " + list.toString());
		list.remove(3);// remove index element
		System.out.println("size of element: " + list.size());
		System.out.println("list  of element: " + list.toString());
		// use simple for loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println("specific index within list: " + list.get(i));
		}
		list.set(2, "tree");
		System.out.println("size of element1: " + list.size());
		System.out.println("list  of element1: " + list.toString());

		for (Object a : list) {// datatype is Object
			System.out.println("print one by one :" + a);
		}
		Collections.sort(list);
		System.out.println(" sort the ascending order size: "+list.size());
		System.out.println( "sort the ascending order element: "+list);
			
			System.out.println("Traversing list through forEach() method:");
			// The forEach() method is a new feature, introduced in Java 8.
			list.forEach(a -> {  // lamda expressions
				System.out.println("for each method use by lamba expressions: "+a );
			});
			System.out.println("Traversing list through Iterator interface:");
			//Iterator object can be use to iterate a collection only once, for
			//2nd iteration create new Iterator object
			Iterator itr=list.iterator();      // false no next element
			System.out.println(itr.hasNext());//hasNext used to true nwxt element or
			System.out.println(itr.next());
			System.out.println(itr.next());
			System.out.println(itr.next());
			System.out.println(itr.hasNext());
			itr.remove();// elememt delete 
			
			
			while (itr.hasNext()) {
			System.out.println(itr.next());
			
	System.out.println(itr.hasNext());
	}
			System.out.println("*********with used Iterator Object**********");
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			System.out.println("*******with new Iterator Object************");
			Iterator itr2 = list.iterator();
			while(itr2.hasNext()) {
				System.out.println(itr2.next());
				
				
			}
}}
	
