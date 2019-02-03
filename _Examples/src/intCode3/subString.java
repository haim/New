package intCode3;

public class subString {

	public static void main(String[] args) {
		
		String str = "cagan yildirdim";
		System.out.println(str.length());
		System.out.println(str.charAt(6));
		System.out.println(str.toUpperCase());
		
		System.out.println(str.substring(1, 4));
		System.out.println(str.substring(6, 15)); //beginning include, ending exclusive 
		System.out.println(str.substring(6).toUpperCase());
		System.out.println(str.substring(0, 3).toUpperCase()+str.substring(3, 6).toLowerCase());
		System.out.println(str.substring(6, 14) + str.substring(14,15).toUpperCase());
		
	}
}
