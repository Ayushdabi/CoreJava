package in.com.rays.iostream;

import java.io.ObjectInputStream;


import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class Readmarksheet {

	
	public static void main(String[] args) throws Exception {
FileInputStream file = new FileInputStream
("");
		
		ObjectInputStream in = new ObjectInputStream(file);
		
		Marksheet m = (Marksheet) in.readObject();
		
		System.out.println(m.name);
		System.out.println(m.chemistry);
		System.out.println(m.physics);
		System.out.println(m.maths);
		
		in.close();
		file.close();
		
		
		
		
	}

}


