package Array;

import java.util.Arrays;

public class High_low {

	public static void main(String[] args) {
		int arr[] = { 20, 40, 30, 60 };
		int temp = 0;
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]);
//		System.out.println(Arrays.toString(arr));
	}

}
