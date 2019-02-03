package intCode3;

public class ReverseArray {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println("");

		for (int i = nums.length - 1; i >= 0; i--) {
			System.out.print(nums[i] + " ");
		}
	}
}
