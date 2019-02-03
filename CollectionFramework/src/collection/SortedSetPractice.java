package collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetPractice {

	public static void main(String[] args) {

		SortedSet<Integer> sSet = new TreeSet<>();
		sSet.add(123);
		sSet.add(1212);
		sSet.add(12);
		sSet.add(1233);
		sSet.add(124);

		System.out.println(sSet);
		System.out.println(sSet.first());
		System.out.println(sSet.last());
		System.out.println(sSet.tailSet(124));
		System.out.println(sSet.subSet(122, 125));
		System.out.println(sSet.headSet(124));
		/*
		 * Create Sorted of String and add 5 elements and see what order you get
		 * 
		 */

		SortedSet<String> sSet1 = new TreeSet<>();
		sSet1.add("abc");
		sSet1.add("Def");
		sSet1.add("1abc");
		sSet1.add("@abc");
		sSet1.add("123a");

		// System.out.println(sSet1);
	}
}
