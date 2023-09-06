package String_Proggram;

public class String_Reverse {
	public static void main(String[] args) {
		String s = "I Love India";
		String arr[] = s.split(" ");
		String temp = "";
		for (int j = arr.length - 1; j >= 0; j--) {
			temp = temp + arr[j] + " ";
		}

		temp = temp.trim();

		System.out.println(temp);
	}
}
