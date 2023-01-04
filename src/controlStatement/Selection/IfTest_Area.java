package controlStatement.Selection;

import java.util.Scanner;

public class IfTest_Area {
 
	public static void main(String[] args) {
		
		int length ;
		int breadth;
		int area;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Input the length  ");
		length = sc.nextInt();
		System.out.println("Input the breadth ");
		breadth =sc.nextInt();
		
		if(length != 0 && breadth !=0 ) {
		
		area = length * breadth;
		System.out.println(" The total area is "+ area);
		
		}
		
		
	}
	
}
