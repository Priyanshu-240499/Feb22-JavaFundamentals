import java.util.Scanner;
public class March3Assignment1 {
//	WAP to find at which first element is present in program...
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 1, 9, 3, 4, 5, 3, 7, 8, 9, 4 };
		System.out.println("Enter the number to be checked: ");
		int check = sc.nextInt();
		boolean bool=false;
		int k=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == check) {
				bool = true;
				k=i;
				break;
			} 
		}
			if (bool == true) {
				System.out.println("Found at "+ k);
			} else {
				System.out.println("Not found");
			}
	}
}


