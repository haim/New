package intCode3;

import java.util.Scanner;
public class sumsum {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = 0;
		int sum = 0;
		int count= 0;
		
		System.out.println("enter the numbers:");
		
		while(n!=-1) {
			sum+=n;
			n=scn.nextInt();
			count++;
		}
		double avg=(double) sum/(count-1);
		System.out.println("Sum: "+sum);
		System.out.println("Avg: "+avg);
		
		
		
		
	}		
}