package Operators;

import java.util.Scanner;

public class BitwiseOperator {

	public static void main(String[] args) {
		//take input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number:");
		int num2 = sc.nextInt();
		//applying Bitwise AND Operator
		int and = num1 & num2;
		System.out.println(num1 + "&" + num2 + "=" + and);
		//applying Bitwise OR Operator
		int or = num1 | num2;
		System.out.println(num1 + "|" + num2 + "=" + or);
		//applying Bitwise XOR Operator
		int xor = num1 ^ num2;
		System.out.println(num1 + "^" + num2 + "=" + xor);
		//applying Bitwise NOT Operator
		int not =~ num1;
		System.out.println(num1 + "~"  + "=" + not);		
		not =~ num2;
		System.out.println(num2 +"~"+ "=" + not);		
	}
}
