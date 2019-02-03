package intCode3;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {

		int[] arr = { 222, 3, 4, 15, 16, 17, 18 };
		int sum = 0;
		int sum1=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 10) {
				sum += arr[i];
			}
		}
		System.out.println(sum);
		////////////////////////////////////////////////////////////////////////
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0 && arr[i]%3==0 ) {
			sum1+=arr[i];
			}
		}
		System.out.println(sum1);
		////////////////////////////////////////////////////////////////////////
		
		int max=arr[0]; //start with the 1st number
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("max is: "+ max);
		
		
		
		
		
		

	}
}