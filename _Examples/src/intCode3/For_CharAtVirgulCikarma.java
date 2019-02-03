package intCode3;

import java.util.Scanner;

public class For_CharAtVirgulCikarma {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String name= sc.next();
		
		for ( int i=0; i<name.length(); i++) {
		char eachChar=name.charAt(i);
		System.out.print(eachChar);	
		
		if(i!=name.length()-1) {
			System.out.print(",");
		}
		}
	
		
	}
}
