package Operators;

import java.util.Scanner;

public class LogicalOpr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first No:");
		int num1=sc.nextInt();
		System.out.println("Enter the second no:");
		int num2=sc.nextInt();
		//both the numbers are even
		if(num1 % 2==0 && num2 % 2==0)
		{
			System.out.println("Both numbers are Even");
		}
		else
		{
			System.out.println("Atleast one number is odd");
	    }
		//check if either number is negative
		if(num1 < 0 || num2 < 0)
		{
			System.out.println("Atleast one number is Negative");
		}
		else
		{
			System.out.println("Both numbers are non-negative");
		}
		if(num1 == num2)
		{
			System.out.println("Both numbers are equal");
		}
		else
		{
			System.out.println("Both the numbers are not equal");
		}
	}
}
