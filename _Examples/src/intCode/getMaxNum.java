package intCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.Assert;

public class getMaxNum {

	public static void main(String[] args) {
		
		int[] list1 = {74,8,12,25,56};
		Arrays.sort(list1);
		System.out.println(list1[0]);
		System.out.println(list1[list1.length-2]);    // second max
	
		
		
		
		List<Integer>list=Arrays.asList(74,8,12,25,56);
		Collections.sort(list);
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
		
	String []list2 = {"kaan", "djdk"};
		
	}
}
