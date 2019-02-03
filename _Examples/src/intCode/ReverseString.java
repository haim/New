package intCode;
public class ReverseString {
	public static void main(String[] args) {
		String str = "Geeks for Geeks";
		String res = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			res += str.charAt(i);}
		System.out.println(res);
		/////////////////////////////////////////////////////////
		StringBuilder strB = new StringBuilder(str);
		strB.reverse();
		System.out.println(strB);
		/////////////////////////////////////////////////////////
		char[]ch = str.toCharArray();
		for (int i = str.length() - 1; i >= 0; i--) {
		System.out.print(ch[i]);
		}
	}
}
