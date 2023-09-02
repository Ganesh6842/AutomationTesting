package Array;

public class MargeArray {
public static void main(String[] args) {
	int arr1[]= {1,3,4,6,7,9};
	int arr2[] = {1,2,3,7,11};
	
	int i=0;
	int j=0;
	for(;i<arr1.length && j<arr2.length;) {
		
	if(arr1[i]<arr2[j]) {
		System.out.print(arr1[i]);
		i++;}
	else if(arr2[j]<arr1[i]) {
		System.out.print(arr2[j]);
		 j++;}
	else {
		System.out.print(arr2[j]);
		j++;i++;}
	}
	for(;j<arr2.length;j++) {
		System.out.print(arr2[j]);
	}
	for(;i<arr1.length;i++) {
		System.out.print(arr1[i]);
	
	

	
	}}}
