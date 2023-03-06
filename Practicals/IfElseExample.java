//n this example, we use the Scanner class to read input from the user. We first create a new Scanner object by passing System.in as an argument to the constructor. This sets up the scanner to read input from the standard input stream, which is usually the keyboard.
//We then use the println() method to prompt the user to enter a number. We read the input from the user using the nextInt() method of the scanner object, and store the result in the number variable.
//We then use an if-else statement to determine whether number is positive, negative, or zero, just like in the previous example. The only difference is that instead of initializing number with a fixed value, we read it from user input.
//Finally, we close the scanner using the close() method to free up any resources used by the scanner.
package corejava;

import java.util.Scanner;

public class IfElseExample 
{
	public static void main(String[] args)
	{
	//creating a scanner class to take input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter anumber");
		//Creating a variable using scanner class object
		int num=sc.nextInt();
		//checking condition
	if(num>0)
	{
		System.out.println("The number is psoitive");
	}
	else if(num<0)
	{
		System.out.println("The number is negative");
	}
	else
	{
		System.out.println("The number is zero");
	}
	sc.close();
}
}