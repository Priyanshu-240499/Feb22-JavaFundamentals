import java.util.Scanner;
public class Feb23Assignment2 {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
//		WAP to check if number is between 0 and 10 and if it is even
		System.out.println("Enter the number");
		int num=Sc.nextInt();
		if (num>0 && num<10 && num%2==0) {
			System.out.println("True");
		}
		else {
			System.out.println("It does nt satisfies the condition");
		}

	}

}
