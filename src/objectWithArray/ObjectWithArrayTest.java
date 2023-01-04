package objectWithArray;
import java.util.Arrays;
import java.util.Scanner;

public class ObjectWithArrayTest {

	

	/*
	 * syntax:
	 * 	class_name[] array_name = new Student[20];
	 * 	
	 * 	e.g.
	 * 	//array of student
	 * 		Student students[] = new Student[20];
	 * 
	 */
	
	public static void main(String[] args) {
		
		Book[] books = getDetails();
		
		printBooks(books);
		
		//print array of nepali book for each loop
		bookProcessing(books);
	}

	private static void bookProcessing(Book[] books) {
		for(Book b1 : books) {
			if(b1.getName().equals("Nepali")) {
				System.out.println(b1);
			}
		}
	}

	private static void printBooks(Book[] books) {
		//print array of book
		System.out.println(Arrays.toString(books));
	}

	private static Book[] getDetails() {
		//create array of book(5)
		
		Scanner sc = new Scanner(System.in);
		
		Book books[] = new Book[5];
	
		for(int i=0;i<books.length; i++) {
		Book b = new Book();
		
		System.out.print("\nEnter name of subject: ");
		b.setName(sc.next());
		System.out.print("Enter name of author: ");
		b.setAuthor(sc.next());
		System.out.print("Enter number of pages: ");
		b.setPages(sc.nextInt());
		System.out.print("Enter the price book: ");
		b.setPrice(sc.nextInt());
		
		books[i] = b;
		}
		return books;
	}

}
