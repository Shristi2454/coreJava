package Practice;

import java.util.Scanner;

public class EvenRange {

	public static void main(String[] args) {
		
		evenNO();
		
	}
	
	static void evenNO() {
		
		int n1,n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		n1= sc.nextInt();
		System.out.println("Enter the second number");
		n2= sc.nextInt();
		
		for(int i=n1;i<=n2; i++ ) {
			
			if(i%2==0) {
				System.out.println("The even numbers are "+ i);
			}
		}
		
		
	}
}
