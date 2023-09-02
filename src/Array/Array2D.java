package Array;

import java.util.Scanner;

public class Array2D {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("ENTER NUMBER OF COL");
	int col = scanner.nextInt();
	System.out.println("ENTER NUMBER OF ROW");
	int row = scanner.nextInt();
	
	int [] [] arr1 = new int [col][row];
	int [] [] arr2 = new int [col][row];
	int [] [] output= new int [col][row];

	System.out.println("enter the first matrix");
	for(int i=0;i<col;i++) {
		for(int j=0;j<row;j++) {
			System.out.println("enter element");
			arr1[i][j]= scanner.nextInt();
		}
	}
	System.out.println("enter the second matrix");
	for(int i=0;i<col;i++) {
		for(int j=0;j<row;j++) {
			System.out.println("enter element");
			arr2[i][j]= scanner.nextInt();
		}
	}
	System.out.println("output matrix");
	for(int i=0;i<col;i++) {
		for(int j=0;j<row;j++) {
			output[i][j]=arr1[i][j]+arr2[i][j];
			System.out.print(output[i][j]+" ");
		}
		System.out.println();
	}
}

}
