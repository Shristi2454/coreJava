package assignment;

import java.util.Scanner;

public class Total_PercentageInArray {

	//WAP to print the subjects and their marks and print the total and  percentage
	
	public static void main(String[] args) {
		
		String subjects[]  = new String[7];
		float marks[] = new float[7];
		float total=0.0f;
		float percentage=0.0f;
		
		Scanner sc= new Scanner(System.in);
		
		for(int i=0; i<7 ;i++) {
			System.out.println("Enter the subject ");
			subjects[i] =sc.next();
			System.out.println("Enter the marks ");
			marks[i]=sc.nextFloat();
		}
		System.out.println("Subjects\t\t\t\t " + " \t\t\tMarks" );
		System.out.println("----------------------------------------------" );
		
		for(float x:marks) {
			total=total+x;
			percentage =(total)/7;
			
			
		}
		for(int i=0;i<7;i++) {
	
				System.out.println(subjects[i] +"\t"+marks[i] );
				System.out.println("----------------------------------------------" );
			
		}
		 
		

		System.out.println("Total marks is "+total );
		System.out.println("Total percentage is "+percentage);
		
		
		
		
	}
}
