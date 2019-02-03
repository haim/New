package intCode;

public class split {

	public static void main(String[] args) {
		String sentence = "I love my country";
		String word = "Houston";

		modify(sentence, word);
	}

	public static void modify(String sentence, String word) {
		String[] arr = sentence.split(" ");

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < arr.length; i++) {
			if (!arr[i].equals(word))
				sb.append(arr[i] + " ");
		}
		System.out.println(sb.toString().trim());
	}
}