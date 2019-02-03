package intCode;

public class SmallestAndLargestNum {
	
	public static void main(String[] args) {
		
		int [] nums = {-10, 12, 44, 78, 3452, -98};
		
		int largest = nums[0];
		int smallest = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			if (nums[i]>largest) {
				largest=nums[i];
			}
			else if(nums[i]<smallest){
				smallest=nums[i];
			}
		}
		System.out.println(largest);
		System.out.println(smallest);
		
	}

}
