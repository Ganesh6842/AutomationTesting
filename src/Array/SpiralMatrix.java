package Array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
      List<Integer> spiralOrder(int[][] matrix){
	ArrayList<Integer> result = new ArrayList<Integer>();
	int top =0 ,bottom = matrix.length-1;
	int left = 0 ,right= matrix[0].length-1;
	while(top<=bottom && left<=right) {
		for(int i= left;i<=right;i++) {
			result.add(matrix[top][i]);
		}
		top++;
		
		for(int i= top;i<=bottom;i++) {
			result.add(matrix[i][right]);
		}
		right--;
		
		for(int i= right;i>=left;i--) {
			result.add(matrix[bottom][i]);
		}
		bottom--;
		
		for(int i=bottom;i>=top;i--) {
			result.add(matrix[i][left]);
		}
		left++;
	}
	return result;
}
}
       

















