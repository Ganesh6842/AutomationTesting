package Array;

public class test_1 {
	public static void main(String[] args) {
		int line = 5;
		int star = 1;
		int space = 4;
		int num = 9;
		int diff = 0;
		for (int i = 1; i <= line; i++) {
			for (int k = 1; k <= space; k++) {
				System.out.print("  ");
			}
			int num1 = num;
			int diff1 = diff;
			for (int j = 1; j <= star; j++) {
				System.out.print(num1 + " ");
				num1 += diff1;
				diff1++;
			}
			System.out.println();
			num -= 2;
			space--;
			star++;
			diff++;
		}
	}
}