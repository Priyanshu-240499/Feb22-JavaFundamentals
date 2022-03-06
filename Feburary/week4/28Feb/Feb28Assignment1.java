import java.util.Scanner;
public class Feb28Assignment1 {
//	Method to return sum of two numbers
	public static int Returnsum(int a,int b) {
		int sum=a+b;
		return(sum);
	}
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers: ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int sum=Returnsum(a,b);
	System.out.println(sum);
	}

}
