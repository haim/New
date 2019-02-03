package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * Create a list of prices (Long) 
 * with few duplicate elements 
 * 
 * Task 1.1
 * Generate only unique prices by taking out duplicate
 * 1,2,3,3,22,1, ---- > 1,2,3,22
 * 
 * Task 1.2 
 * Generate ordered collection out of the list 
 * 1,4,3,2,22,100, ---- > 1,2,3,4,22,100
 * 
 * Task 1.3 
 * retrieve the items from 5 - 9 
 * assuming you have 5 and 9 in the list 
 *  1,2,5,8,6,9, 22,100 ---> 5,6,8,9
 * 
 * */

public class SetPractice1 {

	public static void main(String[] args) {

		List<Long> prices = new ArrayList<>(Arrays.asList(1L, 2L, 3L, 3L, 5L, 7L, 7L, 22L, 1L));
		System.out.println("List: " + prices.toString());

		Set<Long> uniquePrices = new HashSet<>(prices);
		System.out.println("Unique List: " + uniquePrices.toString());

		SortedSet<Long> sortedPrices = new TreeSet<>(prices);
		System.out.println("Ordered List: " + sortedPrices.toString());

		System.out.println("Items between 5 and 9: ");
		for (Long each : sortedPrices) {
			if (each >= 5 && each <= 9)
				System.out.print(each + ", \n");

		}
		List<Long> longList = new ArrayList<>();
		longList.add(1088L);
		longList.add(101L);
		longList.add(102L);
		longList.add(100L);
		longList.add(103L);
		longList.add(103L);
		longList.add(104L);
		longList.add(105L);
		longList.add(100L);

		SortedSet<Long> sSet = new TreeSet<>(longList);
		System.out.println(sSet);

		SortedSet<Long> tail = sSet.tailSet(104L);
		System.out.println(tail);

		tail.remove(105L);
		System.out.println(tail);
		System.out.println(sSet);
	}

}
