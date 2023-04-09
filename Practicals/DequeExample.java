package collections;

import java.util.*;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args)
	{
		Deque<String> dq = new ArrayDeque<String>();
		
		//adding elements using different methods
		dq.add("Ball");
		dq.addFirst("Apple");
		dq.add("Cat");
		dq.addLast("Dog");
		
		//Printing elements
		System.out.println("Elements are:"+dq);
		
		//remove & return the head of the Deque
		System.out.println("Removed element is:"+dq.pop());
		
		//after removing elements are
		System.out.println("Elements are:"+dq);
		
		//remove & return the first element of the deque
		System.out.println("Removed first Element is:"+dq.pollFirst());
		
		//remove and return the last element of the deque
		System.out.println("Removed last Element is:"+dq.pollLast());

		//after removing elements are
		System.out.println("Remaining Elements are:"+dq);
	}

}
