package collections;

import java.util.*;
import java.util.Set;

public class TreeSetExample {

	public static void main(String[] args) 
	{
		Set<String> s =new TreeSet<String>();
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("C");
		s.add("D");
		s.add("D");
		System.out.println("Elements are:"+s);
	}

}

