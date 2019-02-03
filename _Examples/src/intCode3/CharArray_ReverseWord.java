package intCode3;

public class CharArray_ReverseWord {

	public static void main(String[] args) {

		String line = " cagan hakan yildirdim";
		
		char[] words = line.toCharArray();

		int s = 0; // start
		int e = 0; // end
		//int i = 0;

		for (int i = 0; i < words.length; i++) {

			while (i < words.length && words[i] == ' ') {
				i++;
			}
			s = i;

			while (i < words.length && words[i] != ' ') {

				i++;
			}
			e = i - 1;
			
		while (e>s) {

			char temp = words[s];
			words[s] = words[e];
			words[e] = temp;
			s++;
			e--;
		}
		}
		System.out.println(words);
	}

}