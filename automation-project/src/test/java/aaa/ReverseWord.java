package aaa;

public class ReverseWord {

	public static void main(String[] args) {

		String word="abcd";
		String result=" ";
		
		for (int i=word.length()-1; i>=0;i--) {
			result+=word.charAt(i);
		}
		System.out.println(result);
	}

}
