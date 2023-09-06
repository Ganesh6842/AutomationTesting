package String_Proggram;

public class String_Addition {
public static void main(String[] args) {
	String s1 = "111";
	String s2 = "222";
	int num1 =0 ,num2 =0;
	for(int i=0;i<s1.length();i++) {
		char ch = s1.charAt(i);
		int temp = ch -'0';
		num1 = num1*10+temp;
			}
	for(int i=0;i<s2.length();i++) {
		char ch = s2.charAt(i);
		int temp = ch -'0';
		num2 = num2*10+temp;
			}
System.out.println(num1+num2);

	
	
	
	
}

}
