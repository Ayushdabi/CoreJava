package in.com.rays.exception;

public class Testaccount {
	public static void main(String[] args) {
		
		Account a = new Account();
		a.Deposite(60000);
		try {
			a.withdrawl(5800);
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
