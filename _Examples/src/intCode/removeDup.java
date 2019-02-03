package intCode;

public class removeDup {

	public static void main(String[] args) {
		removeDup("abbcsadsakhdamasnmbasa");
	}

	public static void removeDup(String str) {
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			if (i != str.lastIndexOf(str.charAt(i))) {
				continue;
			} else {
				result += str.charAt(i);
			}
		}

		System.out.println(result);

	}

}
