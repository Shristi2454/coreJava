package Practice;

import java.util.Scanner;

public class OddNoRange {

	public static void main(String[] args) {
		OddNo();
		
	}
	
	static void OddNo() {
		 
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter first number ");
		int n1=sc.nextInt();
		System.out.println("Enter second number ");
		int n2=sc.nextInt();
		
		for(int i=n1; i<=n2;i++) {
			
			if(i%2!=0) {
				System.out.println("Odd numbers are "+i);
			}
			}
		}
		
		
	}

