package in.com.rays.shallowcloning;

public class TestAccount {
	public static void main(String[] args)  throws CloneNotSupportedException{
		Account a1 = new Account(200);
		Account a2 = (Account) a1.clone();
		a2.balance = 200;
		
		System.out.println(a1.balance);
		
		
	}

}
