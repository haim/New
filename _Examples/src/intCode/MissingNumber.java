package intCode;

public class MissingNumber {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 4, 5 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		int sum1 = 0;
		for (int j = 1; j <= 5; j++) {
			sum1 = sum1 + j;
		}
		System.out.println(sum);
		System.out.println(sum1);
		System.out.println(sum1-sum);
	}
}
//12345