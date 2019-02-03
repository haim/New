package intCode3;

public class searchItemInArray {

	public static void main(String[] args) {

		String grocery[] = new String[] { "apple", "banana", "orange", "tomato", "eggplant" };

		for (int i = 0; i < grocery.length; i++) {
			if (grocery[i].equals("orange")) {
				System.out.println("bingo orange is found at location: " + i);
				break;
			
		}
		
		
			
		}
//////////////////////////////**********************///////////////////////////////
		
		String str = "CyberTek";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'r') {
				System.out.println("letter r is found at index :" + i);
				break;
			}
		}	
	}
}