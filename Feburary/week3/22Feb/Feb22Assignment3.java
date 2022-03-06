import java.util.Scanner;
public class Feb22Assignment3 {
	public static void main(String[] args) {
//	WAP to creat a fuction that check if no. is odd or even. call this function from main method
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		if (a%2==0) {
			System.out.println("It is even");
		}
		else {
			System.out.println("it is odd");
		}

	}
}
