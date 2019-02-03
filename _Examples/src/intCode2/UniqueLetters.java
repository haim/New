package intCode2;

import java.util.HashMap;
import java.util.Map;

public class UniqueLetters {

	//write a method that will print only unique letters of given string
	
	static String str = "aassdfdfwer";
	public static void main(String[]args) {
	Map<Character,Integer> uniqueMap = new HashMap();
	
	for(int i=0; i<str.length(); i++) {
		if(uniqueMap.containsKey(str.charAt(i))) {
			int count = uniqueMap.get(str.charAt(i));
			uniqueMap.put(str.charAt(i), ++count);
		}
		else {
			uniqueMap.put(str.charAt(i),1);
		}
	}
	for(Character i: uniqueMap.keySet()) {
		if (uniqueMap.get(i)<=1) {
			System.out.println(i);
		}
	}
}}
