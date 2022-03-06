import java.util.Scanner;

public class March1Assignment1 {
//	 write a method to reverse a number.................................
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		Reversenum(num);
	}

	public static void Reversenum(int a) {
		int remainder;
		for (int i = a; i > 0;) {
			remainder = i % 10;
			i /= 10;
			System.out.print(remainder);
		}
	}

}
