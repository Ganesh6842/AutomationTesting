package Array;

public class Array2DNew {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < 3; i++) {
			int sum1 = 0;
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
				sum1 += arr[i][j];
			}
			System.out.println(sum1);
		}
		for (int b = 0; b < arr.length; b++) {
			int sum2 = 0;
			for (int a = 0; a < arr.length; a++) {
				sum2 = sum2 + arr[a][b];
			}
			System.out.print(sum2 + " ");
		}
	}
}
