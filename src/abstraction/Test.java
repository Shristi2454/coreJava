package abstraction;

public class Test {

	public static void main(String[] args) {
		
		//abstract class
		CentralBank b = new NabilBank();
		b.getBankName();
		b.getInterestName();
		
		//interface
		UserService us = new UserServiceImp(); 
		us.addUser();
		us.deleteUser();
		us.print();
		
//		CommonService cs = new UserServiceImp();
//		cs.print();
		
		
	}
}
