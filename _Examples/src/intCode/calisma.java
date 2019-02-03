package intCode;

public class calisma {

	public static void main(String[] args) {

		int[] nums = {-10,12, 44, 78, 3452, -98 };

		int largest = nums[0];
		int smallest = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > largest) {
				largest = nums[i];
			} else if (nums[i] < smallest) {
				smallest = nums[i];
			}
		}
		
		
		//I am very happy
		//I am very sad

		StringBuffer bf = new StringBuffer("I am very happy");
		System.out.println(bf.indexOf("happy"));

		int indexHappy =bf.indexOf("happy");
		bf.replace(indexHappy,bf.length(), "sad");

		System.out.println(bf.toString());

	}
}