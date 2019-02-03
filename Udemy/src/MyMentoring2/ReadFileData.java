package MyMentoring2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ReadFileData {

	public static void main(String[] args) throws NumberFormatException, IOException  {

		List<Integer> nums = new ArrayList<>();
		//Set<Integer> nums = new HashSet<Integer>(); (one time, unsorted)
		//Set<Integer> nums = new LinkedHashSet<Integer>(); (one time, insertion order)
		//Set<Integer> nums = new TreeSet<Integer>(); (one time, ascending order)

		FileReader fr = new FileReader("Numbers.txt");
		BufferedReader br = new BufferedReader(fr);
		{
			String value;
			while ((value = br.readLine()) != null) {
				nums.add(Integer.valueOf(value));
			}
		}

		//Collections.sort(nums);
		System.out.println(nums);

	}
}
