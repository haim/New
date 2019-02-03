package intCode3;

public class ForEachLoop {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 5, 6, 8 };
		System.out.println("for loop");
		for (int i = 0; i < numbers.length; i++) {
			int eachNum = numbers[i];
			System.out.println(eachNum);
		}
		System.out.println();
		System.out.println("for each loop");
		for (int item : numbers) {
			System.out.print(item);
		}

		long[] deneme = { 123L, 234L, 345L };
		for (long item : deneme) {
			System.out.println();
			System.out.print(item);
		}
		double[] deneme2 = { 1.2, 2.3, 3.4 };
		double sum = 0;
		for (double item2 : deneme2) {
			sum += item2;
		}
		System.out.println();
		System.out.println(sum);
	}
}
