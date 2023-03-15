package Operators;
import java.util.Scanner;
public class ArithmeticOperatorMultiplication {

	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter first number:");
	int num1=sc.nextInt();
	System.out.println("Enter the second number");
	int num2=sc.nextInt();
	int multiplication=num1*num2;
	System.out.println("Multiplication:"+multiplication);
	sc.close();

}
}