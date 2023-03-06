//In this example, we're using the Scanner class to read input from the user. We prompt the user to enter the number of times they want to print "Hello, World!", and store that value in the variable num. We then use a for loop to print "Hello, World!" num number of times.
//Note that we're using System.out.println() to print each line, which adds a newline character at the end of each line. If you want to print all of the "Hello, World!"s on the same line, you can use System.out.print() instead.
package corejava;

import java.util.Scanner;

public class ForLoopExample {

	public static void main(String[] args)
	{
		//creating a scanner class to take input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of times you want to print Happy holi");
		//Creating a variable using scanner class object
		int num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			System.out.println("Happy Holi");		}
		}

}
