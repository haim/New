package myMentoring;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {

		Set<String> st;
		HashSet<String> st1;
		LinkedHashSet<String> st2;

		/* Set interface inherit common features from Collection interface
		 * 
		 * Set<String> st1;
		 * 
		 * Set is a Collection that cannot contain duplicate elements.
		 * 				
		 * Set Interface (one time)----> HashSet,LinkedHashSet,TreeSet (Concrete class)
		 *
		 ***** HashSet Class (unordered and unsorted and unpredictable)
		 * 
		 * >>>>>>>>>>HashSet extends AbstractSet implements Set Interface extends Collection
		 *
		 * A HashSet is unordered and unsorted Set.
		 * 
		 * When we iterate through a HashSet, the order is unpredictable.
		 *
		 ***** LinkedHashSet Class (one time, insertion order, predictable)
		 *
		 * LinkedHashSet<String> st2;
		 *
		 * LinkedHashSet is the ordered version of HashSet. The only difference between HashSet 
		 * 
		 * and LinkedHashSet is that LinkedHashSet maintains the insertion order.
		 * 
		 * >>>>>>>>>>LinkedHashSet extends HashSet extends AbstractSet implements Set Interface extends Collection extends Iterable
		 *
		 ***** TreeSet Sınıfı (ascending order, alfabetical order)
		 * 
		 * TreeSet orders its elements based on their values.
		 * 
		 * it is slower than HashSet. 
		 *
		 * HashSet vs LinkedHashSet vs TreeSet
		 *
		 */
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new LinkedHashSet<String>();
		Set<String> set3 = new TreeSet<String>();
		// System.out.println(set1.isEmpty());

		// HashSet (one time, unsorted)
		set1.add("Java");
		set1.add("Python");
		set1.add("C++");
		set1.add("Javascript");
		set1.add("Java");
		
		// LinkedHashSet (one time, insertion order)
		set2.add("Java");
		set2.add("Python");
		set2.add("C++");
		set2.add("Javascript");

		// TreeSet (one time, ascending order)
		set3.add("Java");
		set3.add("Python");
		set3.add("C++");
		set3.add("Javascript");
		

		System.out.println("************HashSet************");
		for (String s : set1) {
			System.out.println(s);
		}
		System.out.println("************LinkedHashSet************");
		for (String s : set2) {
			System.out.println(s);
		}
		System.out.println("************TreeSet************");
		for (String s : set3) {
			System.out.println(s);
		}
		System.out.println("************************");
		System.out.println(set1.contains("Go"));
		System.out.println(set1.contains("Java"));
		System.out.println(set1.isEmpty());
		
		set1.remove("Java");
		
		for (String s : set1) {
			System.out.println(s);
		}
		System.out.println("************************");
		
		System.out.println(set1.equals(set3));//This particular method is used to make equal comparison between two objects.
		System.out.println(set1.hashCode());//memory address
		System.out.println(set2.hashCode());
		System.out.println(set3.hashCode());
		System.out.println(set1.size());//The size operation returns the number of elements in the Set. 
		System.out.println(set1.isEmpty());//The isEmpty method does exactly what you think it would. 
		System.out.println(set1.containsAll(set2));
		System.out.println(set2.addAll(set1));//returns true if s2 is a subset of s1.
		// set3.add("Java"); only one time
		
		System.out.println("//////////////////////");
		
		Set<String> s = new HashSet<String>();

		s.add("Java");
		s.add("Python");
		s.add("C++");
		s.add("C++");

		System.out.println(s.size() + "distinct words: " + s);
		
		System.out.println("//////////////////////");

		Set<String> set4 = new HashSet<String>();
		Set<String> set5 = new HashSet<String>();

		set4.add("1");
		set4.add("2");
		set4.add("3");
		set4.add("4");

		set5.add("9");
		set5.add("7");
		set5.add("5");
		
		//addAll()
		Set<String> union = new HashSet<String>(set5);//constructor is not empty this time
		union.addAll(set4);
		System.out.println(union);
		//removeAll()
		Set<String> difference = new HashSet<String>(set4);
		difference.removeAll(set5);
		System.out.println(difference);
		System.out.println(set5);
		//retainAll()
		Set<String> intersection = new HashSet<String>(set5);// kesisim
		intersection.retainAll(set4);
		System.out.println(intersection);
		
		System.out.println("************************");

		
		Set<Integer> sSet = new TreeSet<>();
		sSet.add(747447);
		sSet.add(456);
		sSet.add(9);
		sSet.add(999);

		System.out.println(sSet);
		//System.out.println(sSet.first());
		//System.out.println(sSet.last());
		//System.out.println(sSet.tailSet(456));
		//System.out.println(sSet.subSet(456, 999));
		//System.out.println(sSet.headSet(789));	
		
	}

}