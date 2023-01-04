package controlStatement.Selection;

import java.util.Scanner;

public class IfTest_SimpleInterest {

	public static void main(String[] args) {
		int principle, time, rate;
		int SI;
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Input the principle");
		principle = sc.nextInt();
		System.out.println("Input the time");
		time= sc.nextInt();
		System.out.println("Input the rate");
		rate= sc.nextInt();
		
		sc.close();
		
		if(principle !=0 && time != 0 && rate !=0) {
			SI = (principle * time * rate )/100;
			System.out.println(" Total of Simple Interest is " + SI);
		}	
	}
}
