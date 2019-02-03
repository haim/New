package myMentoring;

import java.util.HashSet;
import java.util.Set;

public class FindDups {

	public static void main(String[] args) {

		Set<String> s = new HashSet<String>();

		s.add("kaan");
		s.add("cagan");
		s.add("kaan");
		s.add("hakan");

		//for (String a : args)

			//s.add(a);

		System.out.println(s.size() + " distinct words: " + s);
	}
}
