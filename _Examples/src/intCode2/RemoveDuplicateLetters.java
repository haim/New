package intCode2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateLetters {
	// write a method that will remove all duplicates from string
	//removeDup("abcc");->"abc"
	
	
	static String str= "aaaabbbbcccde";
	public static void main (String []args) {
		Set set = new HashSet();
		for(int i=0; i<str.length(); i++) {
			set.add(str.charAt(i));
		}
		System.out.println(set);
	}
}
