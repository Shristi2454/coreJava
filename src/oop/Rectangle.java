package oop;

import java.util.Scanner;

public class Rectangle {
	
	static void setDim() {
		int length;
		int breadth;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length : ");
		length=sc.nextInt();
		System.out.println("Enter the breadth");
		breadth=sc.nextInt();
		
		getArea(length,breadth);
	}
	
	static void getArea(int length,int breadth) {
		int area=length*breadth;
		System.out.println("The area of rectangle is : "+area);
	}
	public static void main(String[] args) {
		setDim();
		
	}
}
