package assignment1;

import java.util.Scanner;

public class Perimeter {

	public static void main(String[] args) {
		
		float l,b,bt,lt,r;
		float p1,p2,p3;
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter the length of the rectangle");
		l=sc.nextFloat();
		System.out.println("Enter the breadth of the rectangle");
		b=sc.nextFloat();
		System.out.println("Enter the length of the triangle");
		lt=sc.nextFloat();
		System.out.println("Enter the breadth of the tringle");
		bt=sc.nextFloat();
		System.out.println("Enter the radius of the circle");
		r=sc.nextFloat();
		
		p1=2*(l+b);
		p2=2*lt+bt;
		p3= 2*(3.14f)*r;
		
		System.out.println("Area of rectangle: "+p1);
		System.out.println("Area of triangle: "+p2);
		System.out.println("Area of circle: "+p3);
	}
}
