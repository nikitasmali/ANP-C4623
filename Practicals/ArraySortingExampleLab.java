//Write a Java program that takes an array of strings as input from the user and sorts the array in alphabetical order.

package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySortingExampleLab
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int a=sc.nextInt();
		String[] arr=new String[a];
		System.out.println("Enter the array elements:");
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.next();
		}
		Arrays.sort(arr);
		System.out.println("Sorted Arrays:");
		for(String s:arr)
		{
			System.out.println(s+"  ");
		}
		
	}
}