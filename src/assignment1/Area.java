package assignment1;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		
		float l,b,bt,h,r;
		float area1,area2,area3;
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter the length of the rectangle");
		l=sc.nextFloat();
		System.out.println("Enter the breadth of the rectangle");
		b=sc.nextFloat();
		System.out.println("Enter the breadth of the triangle");
		bt=sc.nextFloat();
		System.out.println("Enter the height of the triangle");
		h=sc.nextFloat();
		System.out.println("Enter the radius of the circle");
		r=sc.nextFloat();
		
		area1=l*b;
		area2=(bt*h)/2;
		area3= 3.14f*r*r;
		
		System.out.println("Area of rectangle: "+area1);
		System.out.println("Area of triangle: "+area2);
		System.out.println("Area of circle: "+area3);
	}
}
