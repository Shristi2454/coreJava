package assignment1;

import java.util.Scanner;

public class ASCII {

	public static void main(String[] args) {
		ASCIICode();
	}
	static void ASCIICode() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  ASCII code between 0-128 ");
		int a=sc.nextInt();
		
		System.out.println((char)a);
		
		
	}
}
