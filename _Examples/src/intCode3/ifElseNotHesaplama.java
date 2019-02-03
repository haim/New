package intCode3;

import java.util.Scanner;

public class ifElseNotHesaplama {

	public static void main(String[] args) {
		
		// IF ELSE NOT HESAPLAMA
		//90 + 		AA
		//80-90		BB	
		//70-80		CC
		//70 -		FF
		
		System.out.println("Lutfen notunuzu giriniz:");
		Scanner sc=new Scanner(System.in);
		int i= sc.nextInt();
		
		if(i>=90) {
		System.out.println("AA");
		} else if (i>=80) {
		System.out.println("BB");
		} else if  (i>=70){
		System.out.println("CC");
		} else if  (i<70) {
		System.out.println("FF");
		System.out.println("Sorry, try again!!!");
		}
		
		
	}

}
