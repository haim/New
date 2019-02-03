package collection;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

	public static void main(String[] args) {

		// HashMap<Integer, String>myMap=new HashMap<>();
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "soccer");
		map.put(2, "basketbal");
		map.put(3, "pingpong");

		System.out.println(map);
		// adding items to a map
		System.out.println(map.get(2));
		System.out.println(map.get(17));

		// checking a key exists in a map
		System.out.println(map.containsKey(17));
		System.out.println(map.isEmpty());

		// task
		// create a map of Double as key, String as Value
		// add few items including duplicate key
		// print out and see what you get

		// taskII
		// remove items
		// replace a map value using key
		// replace a map value using both key and value
		// get an item and if the key does not exist return default value

		System.out.println(map.remove(1));
		System.out.println(map.replace(2, "basketbal", "volleyball"));// true
		// System.out.println(map.replace(3, "something else" ));

		System.out.println("*********************");
		Map<Double, String> map1 = new HashMap<>();
		map1.put(1.5, "ab");
		map1.put(2.5, "cd");
		map1.put(3.5, "ef");
		map1.put(4.5, "hg");
		map1.put(4.5, "hg"); // will take only one
		map1.put(4.5, "asassgsajkgd"); // last one will be taken
		System.out.println(map1);
	}
}