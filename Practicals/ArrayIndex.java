package collections;

import java.util.Scanner;

public class ArrayIndex {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter 5 integers:");
		  // enter 5 integers and store them in the array
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) 
        {
            array[i] = sc.nextInt();
        }

        //enter an index
        System.out.println("Enter an index from 0 to 4:");
        int index = sc.nextInt();
        
         try 
         {
            int value = array[index];
            System.out.println("Value at index " + index + " = " + value);
         } 
         catch (ArrayIndexOutOfBoundsException e) 
         {
            System.out.println("Error");
         }

    }
}

