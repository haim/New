package intCode;

import java.util.Arrays;

public class fibonaccci {
	
	public static void main(String[] args) {
		
		int []num = new int [8];
		num[0]=1;
		num [1]=2;
		
		for (int i = 2; i < num.length; i++) {
			num[i]=num[i-1]+num[i-2];
			
		}
		System.out.println(Arrays.toString(num));
	}
	
	

}
