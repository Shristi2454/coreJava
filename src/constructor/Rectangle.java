package constructor;

import java.util.Scanner;

public class Rectangle {

	int l,b;
	
	Rectangle(int l,int b){
		this.l=l;
		this.b=b;
		
	}
	 int returnArea() {
		int area=l*b;
		return area;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value for length");
		int x=sc.nextInt();
		System.out.println("Enter the value for breadth");
		int y=sc.nextInt();
		
		Rectangle r=new Rectangle(x,y);
		int area= r.returnArea();
		System.out.println("Area of Rectangle is "+area);
		
	}
}
