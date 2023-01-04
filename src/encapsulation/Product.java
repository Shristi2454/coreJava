package encapsulation;

import java.util.Scanner;

public class Product {

	private int  id;
	private  String name;
	private String category;
	private double price;
	private double quantity;
	

	Product(int id, String name, String category, double price, double quantity){
		this.id=id;
		this.name=name;
		this.category=category;
		this.price=price;
		this.quantity=quantity;
	}
	
	public int getId(){
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getCategory(){
		return category;
	}
	public void setCategory(String category) {
		this.category=category;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	
	public double getQuantity() {
		return quantity;
	}
	
	public void setQuantity(double quantity) {
		this.quantity=quantity;
	}
	
	
	public static void main(String[] args) {
		
		int Product[] = new int [5];
		
		
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter the name of the product");
			
			
			
		}
	}
	 
	
	
}
