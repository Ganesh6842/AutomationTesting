package String_Proggram;

public class String_subStrin {
	public static void main(String[] args) {
		String str = "top";
		String s1 = "";

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}

		}

	}

}
