package intCode2;

public class FizzBuzz {

	public static void main(String[] args) {
		
//	    Write a short program that prints each number from 1 to 100 on a new line. 
//	    For each multiple of 3, print "Fizz" instead of the number. 
//	    For each multiple of 5, print "Buzz" instead of the number. 
//	    For numbers which are multiples of both 3 and 5, print "FizzBuzz" 
//		instead of the number.
  
	    for (int i = 1; i < 100; i++) {
	      if(i%15==0)
	        System.out.print("FizzBuzz\t\n");
	      else if(i%5==0)
	        System.out.print("Fizz\t");
	      else if(i%3==0)
	        System.out.print("Buzz\t");
	      else 
	        System.out.print(i+"\t");
	    }
	}

}
