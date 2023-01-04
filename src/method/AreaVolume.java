package method;

import java.util.Scanner;

public class AreaVolume {
	
  public static void main(String[] args) {
	  
	  Scanner sc = new Scanner (System.in);
	  System.out.println("Enter the length ");
	  int l= sc.nextInt();
	  System.out.println("Enter the breadth ");
	  int b= sc.nextInt();
	  System.out.println("Enter the height");
	  int h= sc.nextInt();
	  
	  int x = getArea(l,b);
	  System.out.println("The area is "+ x);
 
	  Volume(x, h);	
  }
  
  static int getArea(int l,int b) {
	  
//	  int area = 0;
	 int  area = l*b;
	  
	  return area;
  }
  
  static void Volume(int area, int h) {
	  
//	  int volume = 0;
	  int volume = area * h;
	  System.out.println("The total volume is "+ volume);
	  
  }

}
