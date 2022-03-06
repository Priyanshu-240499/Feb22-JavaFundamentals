import java.util.Scanner;
public class Feb21Assignment4 {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
//		Chech if given number is divisible by 2,8 and not 12......
		System.out.println("Enter the number :");
		int a=Sc.nextInt();
		String result= (a%2==0 && a%8==0 && a%12!=0)?"Yes":"No";
		System.out.println(result);
		

	}

}
