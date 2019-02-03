package intCode3;

public class Break {

	public static void main(String[] args) { 
		
		String str  = "Cybertek Java";
		
		for (int i=0; i<str.length(); i++) {
			
			if((str.charAt(i)=='t') || (str.charAt(i)=='v')) {
			
				break;
			}
			System.out.print(str.charAt(i)+ " ");
			
		}	
	}
}