package file;

import java.io.File;
import java.util.Scanner;

public class FileCSV {
	public static void main(String[] args) {
		//
		String fileName = "Testsv.csv";
		File file = new File(fileName);
		
		try {
			Scanner inputStream = new Scanner(file);
			while(inputStream.hasNext()){
				String data = inputStream.next();
				System.out.println(data);
			}
			inputStream.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
