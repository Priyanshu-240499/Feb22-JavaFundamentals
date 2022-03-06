import java.util.Scanner;
public class Feb28Assignment4 {
	public static int Add(int a, int b) {
//		Calculate program including sum,difference,multiply,divide,average,modulo;Include menu driven logic
		int add=a+b;
		return (add);
	}
	public static int Sub(int a, int b) {
			int sub=a-b;
			return(sub);
	}

	public static int Mul(int a, int b) {
		int mul = a * b;
		return(mul);
	}
	public static int Div(int a, int b) {
		int div = a * b;
		return(div);
	}
	public static int Ave(int a, int b) {
		int ave = (a+b)/2;
		return(ave);
	}
	public static int Mod(int a, int b) {
		int mod = a%b;
		return(mod);
	}
//	
	public static void main(String args[]) {
		char ch='N';
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice:1:Addition, 2:Subtraction,3:Multiplication,4:Division,5:Average,6:Modulo");
	int choice =sc.nextInt();
	int result=0;
	if (choice>=1 && choice <=6) {
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter Second number");
		int num2=sc.nextInt();
		switch (choice) {
		case 1:
			result=Add(num1,num2);
            System.out.println(result);
			break;
		case 2:
			result=Sub(num1,num2);
			System.out.println(result);
			break;
		case 3:
			result= Mul(num1,num2);
			System.out.println(result);
			break;
		case 4:
			result=Div(num1,num2);
			System.out.println(result);
			break;	
		case 5:
			result=Ave(num1,num2);
			System.out.println(result);
			break;	
		case 6:
			result=Mod(num1,num2);
			System.out.println(result);
			break;	
		}
		System.out.println("Do you want to continue Y/N");
		ch=sc.next().charAt(0);
	}
	else {
		System.out.println("invalid input");
		System.out.println("Do you want to continue Y/N");
		ch=sc.next().charAt(0);	
	}
		}while(ch=='Y'|| ch=='y');
	}

}
