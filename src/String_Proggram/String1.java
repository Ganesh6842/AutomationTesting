package String_Proggram;

public class String1 {
public static void main(String[] args) {
	String str = "LALAN";
	String temp = str;
	String rev = " ";
	for(int i=str.length()-1;i>=0;i--) {
		rev += str.charAt(i);
	}
	System.out.println(rev);
	
}
}
