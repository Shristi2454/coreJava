package Practice;

import java.util.Scanner;

public class IsEvenUsingMethod {

	/*
	 * Write a method named isEven that accepts an int argument. The method should return true if the argument is even, 
	 * or false otherwise. Also write a program to test your method.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number");
		int a =sc.nextInt();
		
		boolean b= isEven(a);
		System.out.println(b);
		
	}
	
	static boolean isEven(int a) {
		if(a%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
}
