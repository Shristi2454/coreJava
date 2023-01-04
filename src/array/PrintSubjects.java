package array;

public class PrintSubjects {
	//create printSubject() method to print array of subject
	
	public static void main(String[] args) {
		String Subjects []= {"Maths", "Nepali", "Science", "English" , "Social"};
		printSubjects(Subjects);
	}
	
	static void printSubjects(String data[]) {
		
		for(String x: data) {
		 System.out.println(x);
		}
			
	}

}
