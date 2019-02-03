package intCode3;

public class ReverseSentence {

	public static void main(String[] args) {
		
		String line = "Seyfi  Kaan  Yildirdim.";
		char[] words = line.toCharArray();

		int start = 0;
		int end = 0;

		for (int i = 0; i < words.length; i++) {

			while (i < words.length && words[i] == ' ') {
				i++;
			}

			start = i;// found a start of a word

			while (i < words.length && words[i] != ' ') {
				i++;
			} // != dikkat // find where the word ends

			end = i - 1;

			while (end > start) {

				char temp = words[start];
				words[start] = words[end];
				words[end] = temp;
				start++;
				end--;

			}
		}
		System.out.print("Output:");
		System.out.print(words);
		}
	
}