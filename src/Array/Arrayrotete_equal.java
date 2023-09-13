package Array;

public class Arrayrotete_equal {
	public static void main(String[] args) {
		char arr[] = {'A','B','C','D','E','F'};
		int count = 3;
		boolean status = false;
		for(int i=0;i<arr.length;i++) {
			char ch = arr[arr.length-1];
			for(int j=arr.length-1;j>0;j--) {
				arr[j]=arr[j-1];
			}
			arr[3]= ch;
			for(int k=0;k<arr.length;k++) {
				if(arr[k]==arr[k])
					status = true;
				else
					status = false;
			}
			if(status)
				break;
			else
				count++;
		}
		System.out.println(arr);
		System.out.println(count);
		
	}

}
