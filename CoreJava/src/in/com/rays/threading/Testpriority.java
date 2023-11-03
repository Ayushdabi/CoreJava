package in.com.rays.threading;

public class Testpriority {
	public static void main(String[] args) {
		Prioritythread t1 = new Prioritythread(" kanak") ;
		Prioritythread t2 = new Prioritythread("mahi");
		
		
		t1.setPriority(9);
		
	
		t1.start();
		t2.start();
		
	
	}

}
