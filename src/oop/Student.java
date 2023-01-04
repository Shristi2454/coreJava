package oop;

public class Student {

	
	String name;
	int rollNO;
	String phoneNo;
	String address;
	
	
	void printStudents() {
		System.out.println("Name: "+ name );
		System.out.println("Roll No: "+ rollNO);
		System.out.println("Phone No: "+phoneNo );
		System.out.println("Address: "+address );
		System.out.println("-------------------------" );
		
		
	}
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name= "Sam";
		s1.rollNO=22;
		s1.phoneNo="987654321";
		s1.address="New York";
		
		Student s2= new Student();
		s2.name="John";
		s2.rollNO=12;
		s2.phoneNo= "1234567890";
		s2.address="Washington Dc";
		
		s1.printStudents();
		s2.printStudents();
	}
}
