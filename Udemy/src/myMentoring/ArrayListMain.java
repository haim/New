package myMentoring;

import java.util.Arrays;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Java", "C++");
		//List<String> list = new ArrayList<String>();

		list.add("add");
		//list.add("Java");
		//list.add("Python");
		//list.add("C++");
		//list.add("C++");// can store same elements two
System.out.println(list.toString());
		for (String s : list) {
			System.out.println(s);
		}

	}
}
