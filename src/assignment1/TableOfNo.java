package assignment1;

import java.util.Scanner;

public class TableOfNo {
	
	public static void main(String[] args) {
		
		Table();
	}
	
	static void Table() {
		
	 	Scanner sc = new Scanner(System.in);
	 	System.out.println("Enter any number to get the table of that number");
	 	int n = sc.nextInt();
	 	
	 	System.out.println("The table of "+n+" is" );
	 	for(int i=1; i<=10; i++) {
	 		int t= n*i;
	 		System.out.println(n+" * "+i+ " = "+t);
	 	}
	 	
	 	
	 	
	}

}
