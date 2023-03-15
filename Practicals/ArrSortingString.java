import java.util.Arrays;
import java.util.Scanner;
public class ArrSortingString 
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int a=sc.nextInt();
		String[] arr=new String[a];
		System.out.println("Enter the array element:");
		for(int i=0;i<a;i++)
		{
			arr[i] =sc.next();
		}
		Arrays.sort(arr);
		System.out.println("Sorted Array:");
		for(String s:arr)
		{
			System.out.print(s+"  ");
		
		}
		
	}

}
