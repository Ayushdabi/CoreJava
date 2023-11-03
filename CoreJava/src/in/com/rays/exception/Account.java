package in.com.rays.exception;

import javax.naming.InsufficientResourcesException;

public class Account {
	private int balance;
	private String Accountnumber;
	
	
	public  Account() {
		System.out.println("this is Account");
		
	}
	public Account(int balance,String Account) {
		this.balance=balance;
		this.Accountnumber=Accountnumber;
	}
	public void setBalance(int Balance) {
		this.balance = Balance;
	}
	public int getBalance() {
		return balance;
		
	}
	public void setAccountnumber(String Accountnumber) {
		this.Accountnumber =Accountnumber;	
	}
	public String getAccountnumber() {
		return Accountnumber;
		
	}
	public void Deposite(int Amount) {
		int total =getBalance()+Amount;
		setBalance(total);
		System.out.println("Balance After deposite+"+ getBalance());
	}
	public void withdrawl( int Amount)  throws InsufficientBalance{
		int total= getBalance()-Amount;
		
		if(total <20000) {
			throw new InsufficientBalance();
		}
		else {
			setBalance(total);
			System.out.println("Balance after withdrawl =" +getBalance());
			
		}
	
		
	}
	

}
