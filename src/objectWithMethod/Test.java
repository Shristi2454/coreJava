package objectWithMethod;

public class Test {

	public static void main(String[] args) {
		
//		Product prod = new Product();
//		prod.setId(1);
//		prod.setName("Tv");
//		prod.setPrice(7650);
//		prod.setCompany("LG");
//		
		Test t = new Test();
		Product  prod = t.getProduct();
		t.printProduct(prod);
	}
	
	//object as arguments
	void printProduct(Product p) {
		System.out.println("Id: "+p.getId());
		System.out.println("Name: "+p.getName());
		System.out.println("Price: "+p.getPrice());
		System.out.println("Company: "+p.getCompany());
	}
	
	Product getProduct() {
		
		Product prod = new Product();
		prod.setId(1);
		prod.setName("Tv");
		prod.setPrice(7650);
		prod.setCompany("LG");
		
		return prod;     //return null if nothing to return
	}
}
