import java.util.Scanner;
public class Feb22Assignment1 {
	public static void main(String[] args) {
//		"WAP to caluclate no. of digits in a number entered by user.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int count=0;
		for (int i=a;i>0;) {
			count ++;
			i/=10;
			
		}
		System.out.println(count);
		

	}

}
