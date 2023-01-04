package method;

import java.util.Scanner;

/*
 * Write a program to create the equivalent of a four-function calculator. The program to
   enter two integer’s numbers and an operator. It then carries out the specified arithmetic operator
   operation: addition, subtraction, multiplication or division of the two numbers. Finally, it displays
   the result.
 */
public class MethodTest {
	
	public static void main(String[] args) {
		
		//sum();
		
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Enter any number");
//		int n=sc.nextInt();
//		printTable();
		
//		int x= getsumOf1to100();
//		System.out.println("Sum of 1 to 100 is "+x);
		
		int s = findSmallestValue(4544,7676);
		System.out.println("Smallest Value : "+s);
	
	}
	// 1> no return type with no arguments
	
	static void sum() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int a = sc.nextInt();
		System.out.println("enter the second number");
		int b = sc.nextInt();
		
//		int a = 600;
//		int b= 800;
		
		int s= a+b;
		System.out.println("Total sum is "+ s);
		
	}
	
	// 2> no return type with arguments 
	
	static void printTable(int n) {
		
		for(int i=1; i<=10 ; i++) {
			System.out.println(n+" x "+i+" = "+ (n*i));
		}
		
	}
	
	// 3> return type with no arguments 
	
	static int getsumOf1to100() {
		
		int sum =0;
		for(int i=1; i<=100; i++) {
			
			sum= sum +i;  //sum+=i
			
		}
		return sum;
	}
	
	// 4> return type with argument
	
	static int findSmallestValue(int x, int y) {
		if (x<y)
			return x;
		else
			return y;
		      
	}
	
}




