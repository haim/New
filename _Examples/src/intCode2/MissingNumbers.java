package intCode2;

public class MissingNumbers {
	
	public static void main(String[] args) {

		int[] numbers = { 1, 2, 5, 8, 20 };

		for (int i = 0; i < numbers.length - 1; i++) {

			if (numbers[i] == numbers[i + 1] - 1) {
				continue;
			} else {
				for (int j = 1; j < numbers[i + 1] - numbers[i]; j++) {
					System.out.print(numbers[i] + j + ", ");
				}

			}
		}
	}


}
