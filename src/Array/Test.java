package Array;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the Size");
		int size = s1.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("Enter the First :");
			arr[i] = s1.nextInt();
		}
		int square [] = new int[size];
		for (int i = 0; i < size; i++) {
			if (i % 2 == 0) {
				int temp = arr[i];
				square [i]= temp * temp;
				
			}
		}
		for(int a=0;a<square.length;a++) {
			if(square[a]!=0) {
				System.out.println(square[a]);
			}
		}
	}
}
