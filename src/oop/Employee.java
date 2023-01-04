package oop;

public class Employee {

	String name;
	int yearOfjoin;
	float salary;
	String address;
	
	void printEmployee() {
		
		System.out.println(name+"\t\t\t"+yearOfjoin+"\t\t\t"+ address);
	}
   
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.name="Robert";
		e1.yearOfjoin=1994;
		e1.salary= 100000.11f;
		e1.address="64C-WallsStreet";
		
		Employee e2 = new Employee();
		e2.name="Sam";
		e2.yearOfjoin=2000;
		e2.salary= 90000.88f;
		e2.address="68D-WallsStreet";
		
		Employee e3 = new Employee();
		e3.name="John";
		e3.yearOfjoin=1999;
		e3.salary= 1500000.222f;
		e3.address="64C-WallsStreet";
		

		System.out.println("Name"+"\t\t\tYear of joining"+"\t\tAddress");
		
		e1.printEmployee();
		e2.printEmployee();
		e3.printEmployee();
	}
}
