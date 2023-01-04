package abstraction;

public class UserServiceImp  extends CentralBank implements UserService{ //,CommonService{

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		System.out.println("added success");
	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		System.out.println("deleted success");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("data printed");	
	}

	@Override
	protected void getBankName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void getInterestName() {
		// TODO Auto-generated method stub
		
	}




}
