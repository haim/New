package intCode;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s = "@#&AtuxKlP098latin String 012345";
		s=s.replaceAll("[^0-9]", "");
		//s=s.substring(6, 12);
		System.out.println(s);
	}

}
