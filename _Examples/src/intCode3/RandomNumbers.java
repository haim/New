package intCode3;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {

//		Random rnd = new Random();
//		int num = rnd.nextInt(10);
//		System.out.println(num);

		
		
		Random rnd = new Random();
		int[] nbr = new int[5];
		for (int i = 0; i < nbr.length; i++) {
			nbr[i] = rnd.nextInt(9);
		}
		for (int day : nbr) {
			System.out.print(day + " ");
		}
		
		
	}
}