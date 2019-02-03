package intCode3;

import java.util.Scanner;

public class grocery1 {

	public static void main(String[] args) {

		//grocery shopping
//		* create an array of String called items
//		* add 5 items to the array
//		* create an array of double called prices with capacity of 5
//		* use scanner to get the prices from user
//		* then print out each items with the prices in below format
//				item should be as SOMETHING.the price is : 6.12
//		get sum of  your grocery shopping and print out
		
		String grocery[] = {"apple", "banana", "orange", "tomato", "eggplant"};
		double [] prices = new double [5];
		Scanner sc= new Scanner(System.in);
		double sum=0;
		
		for (int i=0; i<grocery.length; i++) {
		System.out.println("enter price for " + grocery[i].toUpperCase());
		
		prices[i]=sc.nextDouble();
		
		System.out.println("your price for "+ grocery[i]+ " is "+ prices[i]);
		sum+=prices[i];
		}
		
		System.out.println("your balance is " + sum);
		System.out.println("your avarage is " + sum/grocery.length);
		
		
		
		
		
		
		
		
		
		
		
	}
}