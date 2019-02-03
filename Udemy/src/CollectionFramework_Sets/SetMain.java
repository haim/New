package CollectionFramework_Sets;

import java.util.HashSet;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {

		/*Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new LinkedHashSet<String>();
		Set<String> set3 = new TreeSet<String>();

		System.out.println(set1.isEmpty());

		// HashSet 				//karisik olarak yazdirmis
		set1.add("Java");
		set1.add("Python");
		set1.add("C++");
		set1.add("Javascript");
		set1.add("Php");
		
		// LinkedHashSet 		//sirali olarak ekleme siramiza gore siralamis
		set2.add("Java");
		set2.add("Python");
		set2.add("C++");
		set2.add("Javascript");
		set2.add("Php");
		
		// TreeSet 				//alfebetik olarak siralamis
		set3.add("Java");
		set3.add("Python");
		set3.add("C++");
		set3.add("Javascript");
		set3.add("Php");

		set3.add("Php"); // sadece bir defa depolandigindan ekleme yapmiyor

		System.out.println("HashSet******");
		for (String string : set1) {
			System.out.println(set1);
		}
		System.out.println("LinkedHashSet******");
		for (String string : set2) {
			System.out.println(set2);
		}
		System.out.println("TreeSet******");
		for (String string : set3) {
			System.out.println(set3);
		}
		System.out.println("************");
		System.out.println(set1.contains("Go"));
		System.out.println(set1.contains("Java"));

		System.out.println("************");
		set1.remove("Java");
		for (String string : set1) {
			System.out.println(set1);

		}*/
		
		
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		
		set1.add("Java");
		set1.add("Python");
		set1.add("C++");
		set1.add("Javascript");
		set1.add("Php");

		set2.add("Go");
		set2.add("Python");
		set2.add("CSS");
		
		/*
		Set<String> fark = new HashSet<String>(set2);
		System.out.println(fark.removeAll(set1));
		System.out.println(fark);
		*/
		
		
		Set<String> kesisim = new HashSet<String>(set2);
		System.out.println(kesisim.retainAll(set1));
		System.out.println(kesisim);
		
	
		
	}
}