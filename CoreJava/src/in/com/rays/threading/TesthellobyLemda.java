package in.com.rays.threading;

public class TesthellobyLemda {
	public static void main(String[] args) {
		
		Hello1 h = (a,b)->{
			int c= a+b;
			System.out.println("sum"+c);
			
		};
		h.Sum(10,20);
	}

}
