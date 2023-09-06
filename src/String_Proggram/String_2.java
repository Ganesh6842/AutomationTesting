package String_Proggram;

import java.util.Scanner;

public class String_2 {
public static void main(String[] args) {
	int sum=0;
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter the char");
	String str = s1.next();
	for(int i=0;i<str.length();i++) {
		char temp =str.charAt(i);
		for(char ch ='a';ch<='z';ch++) {
			if(temp==ch)
				sum+=ch-96;
		}
	}
	System.out.println(sum);
}
}
