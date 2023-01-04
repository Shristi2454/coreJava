package objectWithArray;
import java.util.Scanner;

public class TestProduct {
	
	public static void main(String[] args) {
		
		Product[] products = new Product[2];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<products.length; i++) {
		
		Product p = new Product();
		
		System.out.print("\nEnter id of the product: ");
		p.setId(sc.nextInt());
		
		System.out.print("Enter name of the product: ");
		p.setName(sc.next());
		
		System.out.print("Enter category of the product: ");
		p.setCategory(sc.next());
		
		System.out.print("Enter price of the product: ");
		p.setPrice(sc.nextInt());
		
		System.out.print("Enter quantity of the product: ");
		p.setQuantity(sc.nextInt());
		
		products[i] = p;

		 }
		
		TestProduct t = new TestProduct();
		
		t.printArray(products);
		t.filterCategory(products);
		t.getTotalQuantity(products);
		t.getTotalPrice(products);
		t.getPriceByCategory(products);

		
	}
	
	void printArray(Product[] products) {
		
		System.out.println("\nId\t\tName\t\tCategory\t\tPrice\t\tQuantity");
		
		for(Product p1: products) {
		System.out.println(p1.getId()+"\t\t"+p1.getName()+"\t\t"+p1.getCategory()+"\t\t"+p1.getPrice()+"\t\t"+p1.getQuantity());
		}
		
	}
	
	void filterCategory(Product[] products) {
		
		System.out.println("\n-------------------------------------------------------------");
		System.out.println("Electronic Products");
		System.out.println("---------------------------------------------------------------");
		System.out.println("Id\t\tName\t\tCategory\t\tPrice\t\tQuantity");
		
		for(Product p: products) {
			if(p.getCategory().equals("Electronics")) {
				System.out.println(p.getId()+"\t\t"+p.getName()+"\t\t"+p.getCategory()+"\t\t"+p.getPrice()+"\t\t"+p.getQuantity());
			}
		}
		
	}
	
	void getTotalQuantity(Product[] products) {
		
		int total=0;
		for(Product p: products) {
			total= total+p.getQuantity();
		}
		System.out.println("\nTotal quantity:"+total);
	}

	void getTotalPrice(Product[] products) {
		
		int totalPrice = 0;
		for(Product p: products) {
			totalPrice= totalPrice+p.getPrice();
		}
		System.out.println("\nTotal price:"+totalPrice);
	}
	
	void getPriceByCategory(Product[] products) {
		int totalPrice = 0;
		for(Product p: products) {
			if(p.getCategory().equals("Electronics")) {
			totalPrice= totalPrice+p.getPrice();
			}
		}
		System.out.println("\nTotal price of electronic products:"+totalPrice);
	}
		
}
