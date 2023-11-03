package in.com.rays.exception;

public class Testloginexception {
	public static void main(String[] args) {

			
			String name = "sunil";
			try {
			if(name.equals("admin")) {
				System.out.println("valid user......!!!");
				
			}else {
				Loginexception e = new Loginexception();
				throw e;
				
			}
			
		}catch(Loginexception e) {
			System.out.println(e);
			
		}
	

		
	}

}
