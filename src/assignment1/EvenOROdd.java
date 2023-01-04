package assignment1;

import java.util.Scanner;

public class EvenOROdd {

	public static void main(String[] args) {
		Num();
	}
	static void Num() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		
		if(n%2==0) {
			System.out.println(n+ " is an even number");
		}
		else {
			System.out.println(n+" is an odd number");
		}
		
	}
}
