package intCode2;

public class MaxValueOfIntsAndStrings {

	public static void main(String[] args) {
		//Write a method that returns max value out of array of integers, and than Strings
		//int[]arr={2,3,4};
		//max(arr)->4;
		
		
			   int numbers[]= {1,5,-9,12,-3,89, 18,23,4,-6};
			   
			   System.out.println("Maximum Value = " + getMaxValue(numbers));
			    
			 
	}
			
			public static int getMaxValue(int[] numbers){
				int maxValue = numbers[0];
				for(int i=1;i<numbers.length;i++){
					if(numbers[i] > maxValue){
						maxValue = numbers[i];
					}
				}
				return maxValue;
			}
	}


