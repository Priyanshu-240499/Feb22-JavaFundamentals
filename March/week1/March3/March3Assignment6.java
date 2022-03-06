import java.util.Scanner;

public class March3Assignment6 {
//	Write a method to Swap two numbers by passing its indices
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms in array:");
		int terms = sc.nextInt();
		Swap(terms);
	}

	public static void Swap(int n) {
		Scanner Sc = new Scanner(System.in);
		int array[] = new int[n];
		System.out.println("Enter number in front of each index ");
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print("index " + i + ":");
			array[i] = Sc.nextInt();
		}
		System.out.println();
		System.out.println("Enter index number to swap (within the index number range)");
		System.out.print("index: ");
		int num1 = Sc.nextInt();
		System.out.print("index: ");
		int num2 = Sc.nextInt();
		int swap = array[num1] + array[num2];
		array[num1] = swap - array[num1];
		array[num2] = swap - array[num2];
		System.out.println();
		System.out.println("New array after swapping is:");
		for (int j = 0; j < n; j++) {
			System.out.print(array[j] + " ");
		}

	}
}

