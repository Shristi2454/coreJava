package assignment1;

import java.util.Scanner;

public class Introduction {
  
	public static void main(String[] args) {
	String name; 
	int age;
	String address;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your name ");
	name=sc.nextLine();
	System.out.println("Enter your age ");
	age=sc.nextInt();
	System.out.println("Enter your address ");
	address=sc.nextLine();
	
	sc.close();
	
	System.out.println("---------------------------------------");
	System.out.println("Your name is "+name);
	System.out.println("Your age is "+age);
	System.out.println("Your address is "+address);
	
	
}
 
}
