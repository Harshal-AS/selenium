package interviewprogram;

import java.util.ArrayList;
import java.util.Collections;

public class Sortarraylistjava {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String> ();
	list.add("harshal");
	list.add("neha");
	list.add("ulhas");
	list.add("rutuja");
	list.add("pranjali");
	list.add("megha");
	
	//before sorting
	System.out.println("before sorting: "+list);
	//sortingarraylist ascending order 
	//after sorting
	Collections.sort(list);
	System.out.println("After sorting: "+list);
	}
	

}
