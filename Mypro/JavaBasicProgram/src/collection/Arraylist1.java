package collection;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();// Creating arraylist - default size is 10
		list.add("harshal");
		list.add("pratik");
		list.add(true);
		list.add('A');
		list.add("pankaj");
		list.add(new Arraylist1());// package.classname@652424457
		list.add("pankaj");// duplicate elements allows
		System.out.println("size of list: " + list.size());
		System.out.println("Elements of list: " + list);
//		lis.add("aaru");
//		System.out.println("size of list: " + list.size());
//		System.out.println(list);// aaraylist anytime add or remove the elements
//		lis.remove("harshal");
//		System.out.println("size of list: " + list.size());
//		System.out.println("Elements of list: " + list);
//		
		System.out.println("Traversing list through for loop:");
		 // simple for loop use
		for (int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
				// set method = use change and updated 
				list.set(2, "false");
				System.out.println("size of list: " + list.size());
				System.out.println("Elements of list: " + list);
				
		}
		// Traversing list through for-each loop
				// use for each loop
			for (Object har:list) { //(data variable -type:aaray) syntax of each for loop
	System.out.println(har);
			}
       
	}}


