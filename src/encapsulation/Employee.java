package encapsulation;

public class Employee {

	private int empID;
	private String name;
	private String ssn;
	private double Salary;
	
	Employee(int empID,String name, String ssn, double Salary) {

		this.empID=empID;
		this.name=name;
		this.ssn=ssn;
		this.Salary=Salary;

	}
	
	public int getEmpID() {
		return empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public double getSalary() {
		return Salary;
	}
	
	public  void raiseSalary(double increase) {
		Salary++;
	}
	
	void printEmployee() {
		Employee e= new Employee(empID, name, ssn, Salary );
		e.setName("Mansa");
		
		System.out.println(e);
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", ssn=" + ssn + ", Salary=" + Salary + "]";
	}
	
	public static void main(String[] args) {
//		printEmployee();
	}
	
}
