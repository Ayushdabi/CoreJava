package in.com.rays.iostream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TestREader1 {
public static void main(String[] args) throws IOException {
	FileReader file = new FileReader("C:\\Users\\udayd\\Desktop\\kanak soni\\kanak.txt");
	Scanner sc = new Scanner(file);
	while(sc.hasNext()) {
		System.out.println(sc.nextLine());
	}
	sc.close();
}
}
