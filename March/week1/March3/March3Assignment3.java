import java.util.Scanner;


public class March3Assignment3 {
//	WAP to check difference in two arrays:
	public static void main(String args[]) {
		int arr1[] = { 12, 24, 46, 68, 98, 86, 64 };
		int arr2[] = { 34, 5, 46, 79 };
		int diff[] = new int[7];
		for (int i = 0; i <= 3; i++) {
			diff[i] = arr1[i] - arr2[i];
			System.out.print(diff[i] + " ");
		}
		for (int j = arr2.length; j < arr1.length; j++) {
			diff[j] = arr1[j];
			System.out.print(diff[j] + " ");
		}
	}

}
