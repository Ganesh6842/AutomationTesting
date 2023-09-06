package String_Proggram;

public class String_Swapping {
	public static void main(String[] args) {
		
String str = "Sachin";
String str2 = "Tendulkar";
        str=str+str2;
        str2 =str.substring(0,str.length()-str2.length());
        str = str.substring(str2.length());
        System.out.println("str name" + str);
        System.out.println(str2 +" str2 name");

	}
}
