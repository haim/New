package intCode2;

public class DiamondOfAsterics {

	public static void main(String[] args) {
		//Write a method that prints a diamond of asteriks
		
	
		   int numRows=31;//Length of the pyramid that we want.31 is just an example
		      int midrow = (numRows+1)/2;//midrow is the middle row and has numRows number of *

		      int diff=0;
		      for(int i=1;i<numRows+1;i++)
		      {
		         for(int j=1;j<numRows+1;j++)
		         {
		            if(((midrow-diff)<=j && (j<=midrow+diff)))
		            {
		               System.out.print("*");
		            }else
		            {
		               System.out.print(" ");
		            }

		         }
		         System.out.println();
		         if(i<midrow)
		         {
		         diff++;
		         }else
		         {
		            diff--;
		         }
		      
		
		      }}}

