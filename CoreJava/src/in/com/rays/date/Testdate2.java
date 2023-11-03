package in.com.rays.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Testdate2 {
	public static void main(String[] args) {
		
	
	
	Date d = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat();
	String s = sdf.format(d);
	System.out.println(s);
	
	}
}
