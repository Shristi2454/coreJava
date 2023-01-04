package assignment1;

import java.util.Scanner;

public class Volumeofcylinder {

	public static void main(String[] args) {
		float h,r;
		float v=0f;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height of the Cylinder");
		h=sc.nextFloat();
		System.out.println("Enter the raduis of the Cylinder");
		r=sc.nextFloat();
		
		v= 3.14f*(r*r)*h;
		System.out.println("Total Volume of Cylinder = "+v);
		
	}
}
