package intCode;

public class printUnique {

	public static void main(String[] args) {
		printUnique("abbc");
	}

	public static void printUnique(String str) {
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			String sub = str.substring(0, str.lastIndexOf(str.charAt(i)));
			if (!sub.contains(str.charAt(i) + "")) {
				System.out.print(str.charAt(i));
			}
		}
	}
}
