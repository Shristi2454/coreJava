package inheritance;

public class Programmer  extends Employee{
	
	String proLang;
	String projectName;
	int bonus;
	
	void print() {
		
		super.print();
		
		System.out.println("Language: "+proLang);
		System.out.println("Project Name: "+projectName);
		System.out.println("Bonus: "+bonus);
	}
	
	public static void main(String[] args) {
		
		Programmer p1 = new Programmer();
		p1.id=4499;
		p1.name="Shiva Ram";
		p1.companyName="Cotiviti";
		p1.salary=10000000;
		p1.proLang="Java";
		p1.projectName="Health Care";
		p1.bonus= 50000;
		
		p1.print();
	}

}
