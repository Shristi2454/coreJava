package oop;

public class StudentClass {

	String name;
	int rollNo;
	
	void printStudent() {
		System.out.println("Student name= "+name);
		System.out.println("Student roll no. = "+ rollNo);
	}
	public static void main(String[] args) {
		
		StudentClass s = new StudentClass();
		s.name="John";
		s.rollNo=2;
		
		s.printStudent();
		
	}
	
}
