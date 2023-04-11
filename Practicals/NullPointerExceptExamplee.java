package collections;

import java.util.Scanner;

public class NullPointerExceptExamplee {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
      
        try 
        {  
            int number = Integer.parseInt(input);
            System.out.println("Number:"+number);
        } 
        catch (NullPointerException e)
        {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

	}
}
