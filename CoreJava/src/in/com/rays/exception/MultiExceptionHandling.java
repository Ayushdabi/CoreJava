package in.com.rays.exception;
 
public class MultiExceptionHandling {
	public static void main(String[] args) {
		
		String name = "uady";
		try {
			System.out.println(name.length());
			System.out.println(name.charAt(0));
			
		} catch (NullPointerException e) { 
			System.out.println("Name can't be null");
			
//		}catch (StringIndexOutOfBoundsException e) {
//			System.out.println("String is small");
		}
	}

}
