import java.util.Scanner;
public class Feb22Assignment5 {

	public static void main(String[] args) {
//		use while loop to calculate factorial of a number by taking user input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		int product=1;
		while (a>=2) {
			product*=a;
			a--;
		}
		System.out.println(product);

	}

}
