package in.com.rays.threading;

public class TestDaemothread {
	 public static void main(String[] args) {
		 Daemothread t = new Daemothread();
			
			t.setDaemon(true);
	 t.start();
	 
	 try {
		Thread.sleep(2000);
		
	} catch (InterruptedException e ) {
	}
	System.out.println("chlo chle ");
	System.out.println("chlo nahi chle ");
		
		
	}
}
