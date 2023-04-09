package collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args)
	{
		Vector<String> v = new Vector<String>();
		
		//adding object in vector
		v.add("Abha");
		v.add("Pihu");
		v.add("Rani");
		v.add("Ruhi");
	
	
	//traversing list through iterator
	Iterator IT = v.iterator();
	while(IT.hasNext())
	{
		System.out.println(IT.next());
	}
	
    }
}
