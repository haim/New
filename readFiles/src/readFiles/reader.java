package readFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
/*
 * Store all numbers from Numbers.txt file into a List of Integers
 */
import java.util.List;

public class reader {
	
	public static void main(String[] args) {

		List<Integer>nums = new ArrayList<>();

		try (FileReader fr = new FileReader("Numbers.txt"); 
			BufferedReader br = new BufferedReader(fr)) {
			String value;
			while ((value = br.readLine()) != null) {
				nums.add(Integer.valueOf(value));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Print count of numbers
		System.out.println("Number of lines:" + nums.size());
		System.out.println(nums.indexOf(23));
	}
}

/*

*/