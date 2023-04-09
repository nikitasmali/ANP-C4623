package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args)
	{
		//create a new linked list of integers
		LinkedList<Integer> LT = new LinkedList<Integer>();
		
		//add elements to the linked list
		LT.add(10);
		LT.add(20);
		LT.add(30);
		LT.add(40);
		LT.add(50);
		LT.add(60);
		LT.add(70);
		LT.add(80);
		LT.add(90);
		LT.add(100);
		
		//display the contents of the linked list
		System.out.println("Linked List Contents:");
		
		//traversing list through iterator
		Iterator IT = LT.iterator();
		while(IT.hasNext())
		{
			System.out.println(IT.next());
		}
	}
	

}
