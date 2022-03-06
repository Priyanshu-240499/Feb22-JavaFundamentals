import java.util.Scanner;
import java.util.Scanner;
public class AssignmentFeb18And19 {

	public static void main(String[] args) {
		System.out.println("Sum of the series 1^2+2^2+3^2+......10^2 is");
		int ul = 10;
		int sum = 0;
		for (int i = 1; i <= ul; i++) {
			sum = sum + (i * i);
		}
		System.out.println(sum);
		
		
		
		System.out.println("Converting Fahrenheit to degree celsius");
		System.out.println("value in fahrenheit");
		Scanner Sc=new Scanner(System.in);
		double a=Sc.nextDouble();
		double b=(a-32)*5/9;
		System.out.println("value in degree celsius is"+" "+b);
//		
//		
		System.out.println("Sum of all digits in a number given by user");
		System.out.println("Enter the number");
		int c= Sc.nextInt();
		int sum1=0;
		for (int R=c%10;c>0;) {
			sum1=sum1+R;
			c=c/10;
			R=c%10;
		}
		System.out.println(sum1);
		
		
		System.out.println("Output of the following function"); 
		System.out.println("int f = 10"); 
		System.out.println("if(++f==11 || ++f==12)"); 
		System.out.println("++f;"); 
		System.out.println("System.out.println(f);"); 
		System.out.println("is 12"); 


		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
