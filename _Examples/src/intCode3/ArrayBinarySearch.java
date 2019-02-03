package intCode3;

import java.util.Arrays;

public class ArrayBinarySearch {

	public static void main(String[] args) {

		int[] ints = { 1, 3, 5, 6, 9 };

		System.out.println(Arrays.binarySearch(ints, 3)); //1
		System.out.println(Arrays.binarySearch(ints, 5)); //2
		System.out.println(Arrays.binarySearch(ints, 10)); //-6.sayi
		
		int indexOf9=Arrays.binarySearch(ints, 9);
		System.out.println(indexOf9);
	}

}
