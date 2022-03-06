import java.util.Scanner;
public class March1Assignment2 {
//	Write a mehtod to print fibonacci series......................
	public static void Fibonacci(int num) {
		int a=0;
		System.out.println(a);
		int b=1;
		System.out.println(b);
		int sum;
		int count=2;
		for (int i=0;count<num;i++) {
			count++;
			sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum);
		}				
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many numbers to print: ");
		int a=sc.nextInt();
		Fibonacci(a);		
	}
	

}
