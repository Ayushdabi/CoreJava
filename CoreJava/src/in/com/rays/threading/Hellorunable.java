package in.com.rays.threading;

public class Hellorunable  implements Runnable{
	private String name =   null;


	public Hellorunable( String  n ) {
		this.name= n;
		
	}

		@Override
		public void run() {
			for (int i = 0; i <=50; i++) {
				
				System.out.println(i +name);
				
				
			}
			
		}

}
