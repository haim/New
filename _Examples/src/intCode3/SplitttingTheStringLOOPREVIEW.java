package intCode3;

public class SplitttingTheStringLOOPREVIEW {

	public static void main(String[] args) {

		String str = "I love Java";
		String[] strArr = str.split(" ");

		System.out.println("FOR EACH LOOP");
		
		for (String word : strArr) {
			System.out.println(word);
			//System.out.println(word + " has " + word.length() + " char");
		}
		
		System.out.println("FOR LOOP");
		for (int i = 0; i < strArr.length; i++) {
			System.out.println("my word is " + strArr[i]);
			
		}

		System.out.println("WHILE LOOP");
		int j = 0;
		while (j < strArr.length) {
			System.out.println("my word is " + strArr[j]);
			j++;
		}

		System.out.println("DO WHILE LOOP");
		int k = 0;
		do {
			System.out.println("my word is " + strArr[k]);
			k++;
		} while (k < strArr.length);

		///////

		String x = "From Jersey to Virginia 4 hours";
		x = x.replace("to", "TO");
		System.out.print(x+"\n");
		
		//I am very happy
		//I am very sad

		StringBuilder bf = new StringBuilder("I am very happy");
		System.out.println(bf.indexOf("happy"));

		int indexHappy =bf.indexOf("happy");
		bf.replace(indexHappy,bf.length(), "sad");

		System.out.println(bf.toString());

	}
}