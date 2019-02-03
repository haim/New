package intCode;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {
	
	public static void main(String[] args) {
		
		String names[] = {"Kaan", "Cgn", "Hkn", "Kzbn", "Kzbn"};
		//compare each element
		for (int i = 0; i < names.length; i++) {
			for (int j = i+1; j < names.length; j++) {
				if(names[i].equals(names[j])) {
					System.out.println("duplicate is: "+ names[i]);
				}
			}
		}
		//HashSet
		Set<String>store=new HashSet();
		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println(name);
			}
		}
		//HashMap
		Map<String, Integer>storeMap=new HashMap();
		for (String name : names) {
			Integer count=storeMap.get(name);
			if(count==null) {
				storeMap.put(name, 1);
			}else {
				storeMap.put(name, ++count);
			}
		}
		Set<Entry<String,Integer>>entrySet= storeMap.entrySet();
		for(Entry<String,Integer> entry:entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
	}
}
