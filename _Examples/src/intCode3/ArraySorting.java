package intCode3;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {

		int[] intArray = { 2, 15, 7, 1, 3 };
		Arrays.sort(intArray);
		for (int item : intArray)
		System.out.println("numbers " + item);
		
		
		String names[] = { "1cgn", "Hkn", "$kaan", "kzbn" }; ///first character///
		Arrays.sort(names);
		for (String item : names) {
		System.out.println("names " + item);
		}
		
	}
}
