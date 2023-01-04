package assignment2;

public class Account {

	private int accNo;
	private int pin;
	private float available_Balance; 
	private float total_Balance;
	
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public float getAvailable_Balance() {
		return available_Balance;
	}
	public void setAvailable_Balance(float available_Balance) {
		this.available_Balance = available_Balance;
	}
	public float getTotal_Balance() {
		return total_Balance;
	}
	public void setTotal_Balance(float total_Balance) {
		this.total_Balance = total_Balance;
	}
	
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", pin=" + pin + ", available_Balance=" + available_Balance
				+ ", total_Balance=" + total_Balance + "]";
	}
	
	
}
