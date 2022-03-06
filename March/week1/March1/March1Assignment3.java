import java.util.Scanner;
public class March1Assignment3 {
//	Write a method to print to swap to no.s without using third variabe................
	public static void Swap(int a,int b) {
		int sum=a+b;
		a=sum-a;
		b=sum-a;
		System.out.println("Swapped numbers are "+a+ " "+ b);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two no.s ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		Swap(num1,num2);	
	}
}
