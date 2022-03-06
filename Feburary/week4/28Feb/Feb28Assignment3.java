import java.util.Scanner;
public class Feb28Assignment3 {
//	Write 3 different methods each takes int value and return max value.
			public static int Enterint1(int a) {
				return (a);
			}
		
			public static int Enterint2(int b) {
				return (b);
			}
		
			public static int Enterint3(int c) {
				return (c);
			}
		
		public static int Greatestvalue(int a1,int a2,int a3) {
			if(a1>a2) {
				if(a1>a3) {
					return(a1);
				}
				else {
					return(a3);
				}
			}else {
				if(a2>a3) {
					return(a2);
				}
				else {
					return(a3);
				}
			}
		}


public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter integer number 1: ");
	int num1 = sc.nextInt();
	System.out.println("Enter integer number 2: ");
	int num2 = sc.nextInt();
	System.out.println("Enter integer number 3: ");
	int num3 = sc.nextInt();
	int a = Enterint1(num1);
	int b = Enterint2(num2);
	int c = Enterint3(num3);
	int greatestvalue = Greatestvalue(a, b, c);
	System.out.println("The greatest value is: "+greatestvalue);
}
}
