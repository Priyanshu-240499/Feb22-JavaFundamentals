import java.util.Scanner;
public class Feb21Assignment3 {

	public static void main(String[] args) {
//		Find if a number is power of 2..................
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=Sc.nextInt();
		int num;
		for (num=1;num<=a/2;) {
			if (num*num==a) {
				System.out.println("Yes");
				System.exit(num);

			}
			else {
				num++;
			}
		}
		System.out.println("No");

	}

}
