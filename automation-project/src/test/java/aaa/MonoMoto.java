package aaa;

public class MonoMoto {

	public static void main(String[] args) {

		String string1 = "mono";
		String string2 = "moto";

		for (int i = 0; i < string1.length(); i++)
			for (int j = 0; j < string2.length(); j++)

				if (string1.charAt(i) == string2.charAt(j)) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
		
		
	}
}
