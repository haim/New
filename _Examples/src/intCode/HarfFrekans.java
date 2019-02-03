package intCode;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
public class HarfFrekans {
	public static void main(String[] args) {
	
		String str = "SSTRING";
		
		Map<Character, Integer> fr = new LinkedHashMap();
		
		for (int i = 0; i < str.length(); i++) {
		
			char c = str.charAt(i);
			
			if (fr.containsKey(c)) {
			
				fr.replace(c, fr.get(c) + 1);
			
			} else {
			
				fr.put(c, 1);
			}
		}
		
		for (Map.Entry<Character, Integer> entry : fr.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
	}
}