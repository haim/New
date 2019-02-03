package intCode2;

import java.util.Arrays;

public class Move0sToTheEnd {

	public static void main(String[] args) {
		
		int arr[]= {2,0,1,0,5,3};
		
		arr(arr);
		
		
		
		
	}
public static void arr(int[]arr) {
	int[]copy = new int [arr.length];
	int c =0;
	for(int i=0; i<copy.length;i++) {
		if(arr[i]>0) {
			copy[c]=arr[i];
			c++;
			if(c>=copy.length) {
				break;
			}
		}
	}
	System.out.println(Arrays.toString(copy));
		
	}

}
