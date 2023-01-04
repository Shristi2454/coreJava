package oop;

public class Book{
	
	//properties
	String name;
	int price;
	String author;
	int pages;
	
	//method
	void printBook() {
		System.out.println("=======================");
		System.out.println("Name = "+name);
		System.out.println("Price = Rs. "+price);
		System.out.println("Author = "+author);
		System.out.println("Pages = "+pages);
	}
	
	public static void main(String[] args) {
		Book b = new Book();
		b.name ="English";
		b.price = 1200;
		b.author = "Sk Gupta";
		b.pages = 4500;
		
		Book b1 = new Book();
		b1.author ="manisha";
		b1.name ="Science";
		b1.pages = 980;
		b1.price = 1100;
		
		b.printBook();
		b1.printBook();
	}
	
	/*
	 * create class: 
	 */
}
