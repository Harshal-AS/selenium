package interviewprogram;

import java.util.TreeSet;

public class Tresssetexample {

	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<Integer>();
		// element find asending order
		set.add(24);
		set.add(66);
		set.add(54);
		set.add(12);
		//System.out.println("Lowest value: "+set.pollFirst());
		//System.out.println("last value: "+set.pollLast());
		System.out.println("parallelStream: "+set.parallelStream());
		set.add(10);
		System.out.println(set);
	}

}
