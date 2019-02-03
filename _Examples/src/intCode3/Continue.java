package intCode3;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {


		String str = "CyberTek Java";

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'k') {

				continue;
			}
			System.out.print(str.charAt(i));
		}

	}

}
