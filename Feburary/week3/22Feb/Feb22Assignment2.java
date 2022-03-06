import java.util.Scanner;
public class Feb22Assignment2 {

	public static void main(String[] args) {
//		Apply do while loop to calculate factorial of a number such that, program asks  user, if he wants to continue, if yes, program should run again
		Scanner sc=new Scanner(System.in);
		char ch;
		int product=1;
		do {
			System.out.println("Enter the number");
			int n=sc.nextInt();
			for (int i=n;i>=2;i-- ) {
				product*=i;	
			}
			System.out.println(product);
			System.out.println("Do you want to continue this program again Y/N");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');

	}

}
