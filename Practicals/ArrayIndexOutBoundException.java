package collections;

import java.util.Scanner;

public class ArrayIndexOutBoundException {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] n = new int[size];
		System.out.println("Enter"+size+"elements:");
		
		for(int i = 0;i<size;i++)
		{
			n[i] = sc.nextInt();
		}
		 
		 try 
	        {
	            // Access the 6th element, which is out of bounds
	            int r= n[5];
	            System.out.println("The value is: " + r);
	        }
	        catch (ArrayIndexOutOfBoundsException e)
	        {
	            System.out.println("Caught an exception: " + e);
	        }
		}
		

	

}
