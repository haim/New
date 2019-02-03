package intCode3;

import java.util.Scanner;

public class Toplama_MaxSayi {

	public static void main(String[] args) {

		// 10 dan buyuk sayilari topla ve max sayiyi bul.

		int[] num = { 5, 22, 33 };
		int sum = 0;
		int max = 0;
		int min = 0;
		for (int i = 1; i < num.length; i++) {
			if (num[i] > 10) {
				sum += num[i];
			}
			if (num[i] > max) {
				max = num[i];
			}
			if (num[i] < min) {
				min = num[i]; // min neden calismiyor?
			}
		}

		System.out.println(sum);
		System.out.println(max);
		System.out.println(min);

	}
}