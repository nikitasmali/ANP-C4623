package Operators;

import java.util.Scanner;

public class StringComparison {
		    public static void main(String[] args) 
		    {
		        Scanner sc= new Scanner(System.in);
		        // Prompt the user to enter two strings
		        System.out.print("Enter the first string: ");
		        String string1 = sc.next();
		        System.out.print("Enter the second string: ");
		        String string2 = sc.next();

		        //Here Using the comparison operators to compare the two strings
		        if (string1.equals(string2)) 
		        {
		            System.out.println("The strings are equal.");
		        } 
		        else if (string1.compareTo(string2) < 0) {
		            System.out.println("The first string comes before the second string alphabetically");
		        }
		        else
		        {
		            System.out.println("The second string comes before the first string alphabetically");
		        }

}
}