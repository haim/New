package intCode;

public class Palindrome {
	
	// find and return the biggest palindrome

	public static void main(String[] args) {
		  getLargestPalindrome("racecar Mom dad and in ini");
		}

		public static void getLargestPalindrome(String str) {

		  String[] arr = str.split(" ");
		  String result = "";
		  int size = 0;
		  for (int i = 0; i < arr.length; i++) {

		    if (isPalindrome(arr[i])) {
		      if (arr[i].length() > size) {
		        size = arr[i].length();
		        result = arr[i];
		      }
		    }
		  }
		  System.out.println(result);
		}

		public static boolean isPalindrome(String str) {

		  StringBuilder sb = new StringBuilder(str);
		  sb.reverse();
		  return str.toLowerCase().equals(sb.toString().toLowerCase());

		}

}
