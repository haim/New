package collection;

import java.util.Arrays;

public class WarmUp {

	public static void main(String[] args) {

		Integer[] arr = { 1, 2, 3, 4, 5 };

		arr = addElement(arr, 6);
		arr = addElement(arr, 7);

		System.out.println(Arrays.toString(arr));
	}

	public static Integer[] addElement(Integer[] arr, Integer i) {
		Integer[] newArr = new Integer[arr.length + 1];

		for (int j = 0; j < newArr.length; j++) {
			if (j != newArr.length - 1)
				newArr[j] = arr[j];
			else
				newArr[j] = i;
		}
		return newArr;
	}
}
