package collection;

import java.util.*;

public class LoopingMap {

	public static void main(String[] args) {

		Map<String, String> jobMap = new HashMap<>();

		jobMap.put("SDET", "Vienna");
		jobMap.put("MannualTester", "Fairfax");
		jobMap.put("DBA", "Herndon");
		jobMap.put("ScrumMaster", "Reston");
		jobMap.put("ProductOwner", "Fairfax");
		jobMap.put("ScrumMaster", "DC");

		System.out.println(jobMap);

		Set<String> keys = jobMap.keySet();
		for (String key : keys) {
			System.out.println(key);
		}

	}

}