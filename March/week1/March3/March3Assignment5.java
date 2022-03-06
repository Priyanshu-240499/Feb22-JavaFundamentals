import java.util.Scanner;
public class March3Assignment5 {
//	Write a method to return sum of all elements in array...........
			public static void main(String args[]) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter number of terms in array:");
				int n = sc.nextInt();
				int result=Sum(n);
				System.out.println("Sum of array is "+result);
			}
			public static int Sum(int n) {
				Scanner Sc = new Scanner(System.in);
				int sum = 0;
				int arrList[] = new int[n];
				for (int i = 0; i < n; i++) {
					System.out.println("Enter array with index " + i);
					arrList[i] = Sc.nextInt();
				}
				for (int j = 0; j < n; j++) {
					sum += arrList[j];
				}
				return sum;
			}

}
