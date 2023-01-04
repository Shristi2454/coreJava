package assignment1;

import java.util.Scanner;

public class Triangle {
	//Write a Program to accept three sides of triangle and display which kind of triangle is formed
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the value of three sides of triangle ");
	    a=sc.nextInt();
	    b=sc.nextInt();
	    c=sc.nextInt();
	    
	    Triangle(a,b,c);
	}
	static void Triangle(int a, int b, int c) {
		
		if(a==b && b==c && a==c) {
			System.out.println("This is Equilateral Triangle");
		}
		else if (a!=b && b!=c &a!=c) {
			System.out.println("This is Scalene Triangle");
		}
		else {
			System.out.println("This is Isosceles Triangle");
		}
		
	}
}
