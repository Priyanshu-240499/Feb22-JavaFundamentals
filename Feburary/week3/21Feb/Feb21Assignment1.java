import java.util.Scanner;

public class Feb21Assignment1 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
//		Find the first 3 terms of 4N+9 where it is divisible by 3
		int count = 0;
		int N;
		int a;
		for (N = 1; count < 3; N++) {
			a = 4 * N + 9;
			if (a % 3 == 0) {
				System.out.println(a);
				count++;
			}
		}

	}
}
