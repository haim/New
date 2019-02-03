package readFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingTxtFileOldWay {
	
	public static void main(String[] args) {
		
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			fr = new FileReader("Numbers.txt");
			br = new BufferedReader(fr);
	
			String value;
			
			while((value=br.readLine()) != null) {
				System.out.println(value);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Last line");
	
//		for(int i = 1; i <= 1000; i++) {
//		System.out.print(i+"-");
//		System.out.println(br.readLine());
//	}
	
	}
}
