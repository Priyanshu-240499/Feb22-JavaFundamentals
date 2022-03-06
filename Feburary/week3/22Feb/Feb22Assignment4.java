import java.util.Scanner;
public class Feb22Assignment4 {

	public static void main(String[] args) {
//		Use while loop to calculate sum of numbers till n, where n is taken from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		int n=a;
		int sum=0;
		while(n>0) {
			sum+=n;
			n--;
				
		}
		System.out.println("Sum of numbers till "+a+" = "+sum);
	
	

	}

}
