package intCode3;

import java.util.Scanner;

public class grocery2 {

	public static void main(String[] args) {
		
		int budget=500;
		int maxItems=5;
		
		boolean hasMoney=true;
		int totalSpent=0;
		int leftToSpend=budget;
		int numberOfItems=0;
		Scanner sc= new Scanner(System.in);
		int price=0;
		while(hasMoney && numberOfItems<maxItems) {
		System.out.println("Total spent:$"+totalSpent+"\t Left:$"+leftToSpend+"\t Number of items:"+numberOfItems);	
			
		System.out.println("next item price:");	
		price=sc.nextInt();
		if(price>leftToSpend) {
			System.out.println("sorry.ask for more money.");
		}else {
		System.out.println("congrats! you have some more");
		totalSpent+=price;
		leftToSpend-=price;
		numberOfItems++;
		if(leftToSpend<=0) {
			hasMoney=false;
			
		}
		}
		
		}
		
		

	}

}
