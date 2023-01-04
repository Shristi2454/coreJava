package Practice;

import java.util.Scanner;

public class CalcSum {
	/*
	 * Write a program with a method named getTotal that accepts two integers as an argument and return its sum.
	 * Call this method from main( ) and print the results.
	 */
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a first number ");
		int a=sc.nextInt();
		System.out.println("Enter a second number ");
		int b=sc.nextInt();
		
		int result= getTotal(a, b);
		System.out.println("The total sum is "+ result);
	
	}
	
	static int getTotal(int a,int b){
		
		int sum=a+b;
		return sum;
	}

}
