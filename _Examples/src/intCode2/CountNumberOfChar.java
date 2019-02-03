package intCode2;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class CountNumberOfChar {
	// write a method that will count number of each char in a String
	// countChar ("abbc");-> {a=1, b=2, c=1}

	public static void countChar(String s) {

		int count = 1;//each letter by default will appear ones
		String str = "";//it's our empty basket. we will store already checked letters

		for (int i = 0; i < s.length(); i++) {//iterating through the string
			if (!str.contains(String.valueOf(s.charAt(i)))) {//valueOf converts char to String. 'a'="a";
				//if str does not contain a, then add a. etc;
				for (int j = 0; j < s.length(); j++) {//will compare a to each letter. to different combinations
					if (i != j && s.charAt(i) == s.charAt(j)) {//compares index of each 
						count++;
					}
				}
				System.out.println(s.charAt(i) + "=" + count);
				count = 1;
				str += s.charAt(i);
			}

		}

	}

	public static void main(String[] args) {
		countChar("abbbbbbbbbccck");
	}
}