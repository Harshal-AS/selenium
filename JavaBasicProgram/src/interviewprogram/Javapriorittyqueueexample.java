package interviewprogram;

import java.util.PriorityQueue;

public class Javapriorittyqueueexample {

	public static void main(String[] args) {
		// createting empty priority queue
		PriorityQueue<Integer> pQueue=new PriorityQueue<Integer>();
		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(30);
		System.out.println(pQueue.peek());
		System.out.println(pQueue.poll());
		System.out.println(pQueue.peek());
	}
	

}
