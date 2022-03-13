import java.util.Scanner;

public class March7Assignment2 {
//	WAP to find all the permutations of the string
	public static void main(String[] args) {
		System.out.println("Enter String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = str.length();
		System.out.println("Permutations of given string are: ");
		generatepermutation(str, 0, n);
	}

	public static String swapstring(String s, int i, int j) {
		char[] arr = s.toCharArray();
		char ch;
		ch = arr[i];
		arr[i] = arr[j];
		arr[j] = ch;
		return String.valueOf(arr);
	}

	public static void generatepermutation(String str, int first, int last) {
		if (first == last - 1)
			System.out.println(str);
		else {
			for (int i = first; i < last; i++) {
				str = swapstring(str, first, i);
				generatepermutation(str, first + 1, last);
				str = swapstring(str, first, i);
			}
		}
	}

}
