package in.com.rays.threading;

public class Withthread extends Thread {
	
String name = null;
	
	public Withthread(String name) {
		this.name = name;
		
	}

	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i+name);
			
		}
	}

}
