package in.com.exercise;

public class Randomno {
	
	public static void main(String[] args) {
		
		 int max = 100;
		 int min =1;
		 int range = max-min+1;
		 
		 for (int i = 0; i <5; i++) {
			 int random = (int)((Math.random()*range)+min); 
			 System.out.println(random);
			
		}
			
		}
		 
	}


