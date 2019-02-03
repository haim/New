package intCode3;

import java.util.Scanner;

public class letterFinder {

	public static void main(String[] args) {

		// how many letter "i" showed up???
		// :) each and every letter: charAt

		String names[] = new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 5 names");
		for (int i = 0; i < names.length; i++) {
			names[i] = sc.next();
		}
		int count = 0;
		for (int j = 0; j < names.length; j++) {
			
			String str = names[j];
			for (int i = 0; j < str.length(); i++) {
				char eachChar = str.charAt(i);
				if (eachChar == 'a' || eachChar == 'A')
					count++;
			}
		}
		System.out.println(count);
	}

}
