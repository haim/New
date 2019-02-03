package intCode3;

import java.util.Scanner;

public class largestNumber {

	public static void main(String[] args) {
		
		/// LARGEST NUMBER ///
		
		System.out.println("how many numbers?");
		Scanner sc= new Scanner (System.in);
		int n= sc.nextInt();
		
		System.out.println("start entering numbers:");
		int largest=0;
		int current=0;
		
		for (int i=0; i<n; i++){
			current=sc.nextInt();
			
			if(current>largest) {
				largest=current;
			}
		}
		System.out.println(largest);
		///////////////////////////////////////////////////////////
		
	
		int height=0;
		int widht=0;
		Scanner sc1=new Scanner (System.in);
		System.out.println("enter the height:");
		height=sc1.nextInt();
		System.out.println("enter the width");
		widht=sc1.nextInt();
		for (int i=0; i<height; i++) {
			for (int ii=0; ii<widht; ii++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

