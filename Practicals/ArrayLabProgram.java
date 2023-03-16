package Arrays;

import java.util.Scanner;

public class ArrayLabProgram 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//Entering the size or taking size input from user
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		//Entering the elements
		System.out.println("Enter the array elements:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int SumOfEvenNumbers=0;
		//For storing sum of all even numbers
		int ProductOfOddNumbers=1;
		//for storing product of all odd numbers
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2==0)
			{
				SumOfEvenNumbers += arr[i];
			}
			else
			{
				ProductOfOddNumbers *= arr[i];
			}
		}
		//Printing sum and product
		System.out.println("\nSum of all even numbers:"+ SumOfEvenNumbers);
		System.out.println("Product of all odd numbers:"+ ProductOfOddNumbers);
	}
}
