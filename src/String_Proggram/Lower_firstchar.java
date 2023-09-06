package String_Proggram;

public class Lower_firstchar {
public static void main(String[] args) {
	String s1 = "Morning";
	String temp ="";
	for(int i=0;i<s1.length();i++) {
		char ch = s1.charAt(i);
		if(ch>='a'&& ch<='z') {
			temp+=((ch+"").toUpperCase());
		}else {
			temp+=((ch+"").toLowerCase());
		}
	}
	System.out.println(temp);
}
}
