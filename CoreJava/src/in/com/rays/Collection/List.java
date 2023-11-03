package in.com.rays.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class List {
	 public static void main(String[] args) {
 Collection c = new ArrayList();
 c.add("uady");
 c.add("kanak");
c.add("Anish");
System.out.println(c);

Collection c1= new ArrayList();

c1.addAll(c);
System.out.println(c1);
c1.add("abhishek");
System.out.println(c1.contains("anish"));

System.out.println(c1.isEmpty());
System.out.println(c1.size());
System.out.println(c1.remove("Anish"));
System.out.println(c1);
System.out.println(c1.containsAll(c1));


			 
			 
			 
			 
			 
		 }
		 
		 
		 
		 
		 

		 
	}


