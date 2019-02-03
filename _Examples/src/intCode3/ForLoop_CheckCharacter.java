package intCode3;

public class ForLoop_CheckCharacter {

	public static void main(String[] args) {

		String str = "CyberTek";
		
		for (int i = 0; i < str.length(); i++) {
		
			if (str.charAt(i) == 'r') {
			
				System.out.println("letter found @: " + i);
				
				break;
			}
		}
		System.out.println(str.indexOf('r'));
	}

}
