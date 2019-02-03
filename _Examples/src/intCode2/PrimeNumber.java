package intCode2;

public class PrimeNumber {

	public static boolean prime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				System.out.println(number);}}
		return true;}
	public static void main(String[] args) {
		System.out.println(prime(5));}}
