package Array;

public class Array2DNew1 {
public static void main(String[] args) {
	int arr[] [] = {{1,1,1},{2,2,2},{3,3,3}};
	int output[] [] = new int[3][3];
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.print(arr[i][j]+ " ");
		}
		System.out.println();
	}
	for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
		 
			output[i][j]=arr[j][i];
			System.out.print(output[i][j]+ " ");
	}
		System.out.println();
	}
}
}

