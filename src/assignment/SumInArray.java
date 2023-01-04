package assignment;

import java.util.Scanner;

public class SumInArray {
	//WAP to print the sum of numbers 
	public static void main(String[] args) {
		SumOfArray();
		
	}

	static void SumOfArray() {
		
		int nt = 0;
		int num[] =new int[nt];
	    int  sum = 0;
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of times you want to print numbers ");
		nt=sc.nextInt();
		
		for(int i=1; i<=nt;i++) {
			System.out.println("Enter the number ");
			num[i]=sc.nextInt();
		}
		
		for(int x:num) {
			
			sum= sum +x;
		}
		 System.out.println("The sum of all the numbers is " + sum);
	}
	
}
