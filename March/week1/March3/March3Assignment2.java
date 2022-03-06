import java.util.Scanner;

public class March3Assignment2 {
//	WAP to check last index at which given number is present:
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 1, 9, 3, 4, 5, 6, 7, 1, 9, 3 };
		System.out.println("Enter the number to be checked: ");
		int check = sc.nextInt();
		boolean bool = false;
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == check) {
				bool = true;
				k = i;
			}

		}
		if (bool == true) {
			System.out.println("Found at " + k);
		} else {
			System.out.println("Not found");
		}

	}
}
