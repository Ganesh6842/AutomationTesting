package String_Proggram;

import java.util.Scanner;

public class Good_Morning {
public static void main(String[] args) {
	String str = "Good Morning";
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter the number");
	int no = s1.nextInt();
	if(str.length()%no==0) {
		int temp = str.length()/no;
		for(int i=0;i<str.length();i=i+temp) {
			System.out.println(str.substring(i,i+temp));
		}
	}
		else {
		System.out.println("we can't divide equal parts");
	}
}
}
