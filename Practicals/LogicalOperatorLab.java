
	package Operators;

	import java.util.Scanner;

	public class LogicalOperatorLab {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
		    //asking the user to enter a number between 1 and 100
			System.out.println("Enter a number between 1 and 100:");
			int num=sc.nextInt();
			//Check if the number is within the range of 1 to 100
			if(num >= 1 && num <= 100)
			{
			//checking if the number is both divisible by both 2 and 3
			if(num % 2==0 && num % 3==0)
			{
				System.out.println("The number is divisible by both 2 and 3");
			}
			//Check if the number is divisible by either 2 or 3 but not both
			else if((num % 2==0 || num % 3==0)&&(num % 2==0 && num % 3==0))
					{
				System.out.println("The number is divisible by either 2 or 3 but not both");
					}
			//Check if the number is not divisible by either 2 or 3
			else
			{
				System.out.println("The number is  not divisible by either 2 or 3");
			}}
			else
			{
				System.out.println("The number is within the range of 1 to 100");
			}
			
			}
			

	}



