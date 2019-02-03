package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparingObjects {

	public static void main(String[] args) {

		// List<String> names = Arrays.asList("Adam","Zain","Bob","Dave","Bob") ;

		// Collections.sort(names);

		// System.out.println(names);

		// System.out.println( new Person("Adam", 22) );

		List<Person1> people = new ArrayList<>();
		people.add(new Person1("Adam", 22));
		people.add(new Person1("Dave", 62));
		people.add(new Person1("Zain", 32));
		people.add(new Person1("Bob", 42));

		Collections.sort(people);

		System.out.println(people);

		// String s1 = "A" ;
		// String s2 = "B" ;
		// String s3 = "C" ;
		//
		// System.out.println( s1.compareTo(s2) );
		// System.out.println( s1.compareTo(s3) );

	}

}
