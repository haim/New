package collection;

import java.util.*;

public class MapPractice1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Adam", "Adam", "Bob", "Dave", "Bob");

		///
		Map<String, Integer> freMap = new HashMap<>();

		for (String each : names) {

			if (!freMap.containsKey(each)) {
				freMap.put(each, 1);
			} else {
				int exitsingCount = freMap.get(each);
				freMap.put(each, exitsingCount + 1);
			}
		}
		/// if your key does not exists in the map yet
		// --> your count will be 1
		/// if it already exists your count will be
		// existing value incremented by 1

		// freMap.put(each, 0) ;

		System.out.println(freMap);

	}

}
