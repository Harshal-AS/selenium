package interviewprogram;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Javahashsetexample {

	public static void main(String[] args) {
		HashSet<String>set=new HashSet<String>();
		set.add("Ravi");
		set.add("vIJAY");
		set.add("ravi");
		set.add("sahil");
		//TRAVERSUNG ELMENTS
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.Next());
		}
		

	}

}
