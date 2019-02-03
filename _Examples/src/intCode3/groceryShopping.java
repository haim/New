package intCode3;

import java.util.Scanner;

public class groceryShopping {

	public static void main(String[] args) {
	
		String [] products= {"apples", "banana", "pear","bread","pie"	};	
				
		double [] prices= new double[5];
		Scanner sc=new Scanner(System.in);
		double sum=0;
		
		for(int i=0; i<products.length; i++) {
			System.out.println("enter the price for "+ products[i].toUpperCase());
			prices[i]=sc.nextDouble();
			sum +=prices[i];
			System.out.println("your price for "+ products[i]+ " is " +prices[i]);
		}
		
		System.out.println("Sum is: "+ sum);
		
		}
	}				
