package in.com.rays.threading;

public class Testwiththread {
	public static void main(String[] args) {
		
		Withthread t1 = new Withthread("harshit");
		Withthread t2 = new Withthread("pawandeep");
		
		t1.start();
		t2.start();
		
		for (int i = 0; i<=5 ; i++) {
			System.out.println("main");
			
		}
		
	}

}
