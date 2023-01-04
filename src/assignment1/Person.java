package assignment1;

import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		Person();
	}
	static void Person() {
		String name;
		int rollNo;
		String nationality;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		name=sc.nextLine();
		System.out.println("Enter your RollNO");
		rollNo=sc.nextInt();
		System.out.println("Enter your Nationality");
		nationality=sc.next();
		
		System.out.println(name+"'s detail");
		System.out.println("------------------------");
		System.out.println("Name : " +name );
		System.out.println("RollNO: "+rollNo);
		System.out.println("Nationality: "+ nationality);
	}
}
