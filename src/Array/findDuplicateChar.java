package Array;

public class findDuplicateChar {
public static void main(String[] args) {
	char arr[] = {'A','B','A','B','A','C'};
	int count1[] = new int [arr.length];
	for(int i=0;i<arr.length;i++) {
		int count = 1;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
				count1[j]=-1;
			}
		}
		for(int j=0;j<arr.length;j++) {
			if(count1[i]>0) {
				count1[i]=count;
				System.out.print(count1[i]);
				System.out.print(arr[j]);
			}
		}
		
	}
}
}
