package intCode2;

import java.util.ArrayList;
import java.util.List;

public class Numbers1to30 {

	// Write a method which prints out the numbers from 1 to 30
	// but for numbers which are a multiple of 3, print "FIN" instead of the number
	// and for numbers which are a multiple of 5. print "RA" instead of the number
	// for numbers which are a multiple of both 3 and 5, print "FINRA" instead of
	// the number
//	public static void main(String[] args) {
//	   List list = new ArrayList();
//		for (int i = 1; i < 31; i++) {
//			if ((i % 3 == 0) && (i % 5 == 0)) {
//				list.add("FINRA");
//			} else if (i % 3 == 0) {
//				list.add("FIN");
//			} else if (i % 5 == 0) {
//				list.add("RA");
//			} else {
//				list.add(i);
//			}
//		System.out.println(list);}}}

	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//2nd version
		
	public static void main (String[]args) {
	System.out.println("\nDivided by 3: ");		
		for (int i=1; i<30; i++) {
			if (i%3==0) 
			System.out.print("FIN");			
		}			
				
		System.out.println("\n\nDivided by 5: ");
		for (int i=1; i<30; i++) {
			if (i%5==0) System.out.print("RA");			
		}
				
		System.out.println("\n\nDivided by 3 & 5: ");			
		for (int i=1; i<30; i++) {
			if (i%3==0 && i%5==0) System.out.print("FINRA");			
		}
		System.out.println("\n");
  }

}
