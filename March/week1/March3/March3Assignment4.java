import java.util.Scanner;

public class March3Assignment4 {
	public static void main(String args[]) {
//	Binary number to decimal number conversion
		int num = 1010;
		int index = 0;
		int r;
		int sum = 0;
		for (int i = num; i > 0;) {
			r = i % 2;
			i /= 10;
			if (r == 1) {
				sum = (int) (sum + Math.pow(2, index));
				index++;
			} else {
				index++;
			}
		}
		System.out.println(sum);
	}
}
