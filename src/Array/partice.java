package Array;
//user  side input arrey
import java.util.Scanner;

public class partice {
public static void main(String[] args) {
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter the size");
	int size = s1.nextInt();
	int arr [] = new int [size];
	for(int i=0;i<size;i++) {
		System.out.println("enter element");
		arr[i]=s1.nextInt();
	}
	for(int i=0;i<size;i++) {
		System.out.print(arr[i]);
	}
	
}
}
