import java.util.Scanner;
public class Feb28Assignment2 {
//	Write 3 different methods each takes int, float, and long and return its value
			public static int Enterint(int a) {
				return(a);
			}
			public static float Enterfloat(float b) {
				return(b);
			}
			public static long Enterlong(long c) {
				return(c);
			}
			public static void main(String args[]) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter integer number: ");
				int num1=sc.nextInt();
				System.out.println("Enter float number: ");
				float num2=sc.nextFloat();
				System.out.println("Enter long number: ");
				long num3=sc.nextLong();
				int a=Enterint(num1);
				float b=Enterfloat(num2);
				long c=Enterlong(num3);
				float multiplication=(a*b*c);
				System.out.println("Multiplication of two numbers is: "+multiplication);
			}

}
