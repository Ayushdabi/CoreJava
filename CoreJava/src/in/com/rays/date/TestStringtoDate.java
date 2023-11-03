package in.com.rays.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestStringtoDate {
	public static void main(String[] args)  throws ParseException{
		
		 String str = "05/05/2023";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy");
		Date d = sdf .parse(str);
		System.out.println(d);
		
		
	}

}
