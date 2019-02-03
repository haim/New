package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class WarmUp1 {

	public static void main(String[] args) {

		// create a scanner object
		// create a list of names by taking user input
		// include few duplicates
		// and find out how many unique elements

		// optional task
		// find out exactly how many times a name showed up

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * List<String>ls=new ArrayList<>();
		 * 
		 * for (int i = 0; i < 5; i++) { ls.add(sc.nextLine()); }
		 * 
		 * Set<String> st= new HashSet<>(ls);
		 * 
		 * System.out.println(st.size());
		 * 
		 */

		Scanner input = new Scanner(System.in);

		List<String> names = new ArrayList<String>();

		String inputString = null;
		System.out.println("Enter the name to be added to list, or type \"terminate\" to end finish: ");
		while (true) {
			inputString = input.nextLine();
			if (inputString.equals("terminate"))
				break;
			names.add(inputString);
		}

		Set<String> setNames = new HashSet<String>(names);

		System.out.println("Number of unique elements - " + setNames.size());

		List<String> temp = new ArrayList<String>(names);

		for (int i = 0; i < temp.size();) {
			String name = temp.get(i);
			int count = 0;

			for (int j = i; j < temp.size();) {
				if (temp.get(j).equals(name)) {
					count++;
					temp.remove(j);
					continue;
				} else {
					j++;
				}
			}

			System.out.println(name + " - " + count);
		}

	}
}
