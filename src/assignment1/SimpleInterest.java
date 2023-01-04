package assignment1;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		int p,t,r;
		int SI=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of principle ");
		p=sc.nextInt();
		System.out.println("Enter the value of time ");
		t=sc.nextInt();
		System.out.println("Enter the value of rate of interest ");
		r=sc.nextInt();
		
		SI=(p*t*r)/100;
		System.out.println("The total of Simple interest is "+SI);
	}
}
