package interviewprogram;

import java.util.LinkedHashSet;

public class Limkedhashset {

	public static void main(String[] args) {
		//create a hash set 
		LinkedHashSet harshal=new LinkedHashSet();
			
		//add elements to the hash set
		harshal.add("A");
		harshal.add("B");
		harshal.add("E");
		harshal.add("R");
		harshal.add("V");
		//THIS WILL NOT ADD NEW ELMENT
		//A&V ALL READY EXIST
		harshal.add("A");
		harshal.add("V");
		//REMOVING ENTRY FROM ABOVE SET
		System.out.println("REMOVING E: "+harshal.remove("E"));
		System.out.println("CHECKING A IS PRESENT: "+harshal.contains("A"));
		System.out.println(harshal);
		System.out.println(harshal.size());
		
	}}


