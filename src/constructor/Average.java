package constructor;

import java.util.Scanner;

public class Average {

	int a,b,c;
	
	void calcAvg() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a =sc.nextInt();
		System.out.println("Enter the second number");
		int b =sc.nextInt();
		System.out.println("Enter the third number");
		int c =sc.nextInt();
		
		int avg=(a+b+c)/3;
		
		printAvg(avg);
	}
	void printAvg(int avg) {
		
		System.out.println("Total Average = "+avg);
	}
	
	public static void main(String[] args) {
		
		
		Average av=new Average();
		av.calcAvg();
		
		
	}
}
