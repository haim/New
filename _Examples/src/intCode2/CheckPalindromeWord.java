package intCode2;

import java.util.Scanner;

public class CheckPalindromeWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word"); 
		String name = sc.next();

		String s = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			s = s + name.charAt(i);
		}

		if (name.equalsIgnoreCase(s)) {
			System.out.println(name + " is a polidrome");
		} else {
			System.out.println(name + " is not a palindrome");

		}

	}

}
