package methodoveriding;

public class Test {
	
	public static void main(String[] args) {
		
		//static or early binding or object
		NabilBank nb = new NabilBank();
		
		nb.getBankName();
		nb.getInterestRate();
		
		//up-casting
		CentralBank b = new PrabhuBank();  //leads to runtime binding or dynamic binding
		printBankInfo(b);

	}
	
	 
	  //redundancy 
//	void printBankInfo(PrabhuBank b) {
//		
//		b.getBankName();
//		b.getInterestRate();           
//	}
	
	
	//late or dynamic (executed during compile time) binding of object
	//also called run time polymorphism
	static void printBankInfo(CentralBank b) {
		
		b.getBankName();
		b.getInterestRate();
	}

}
