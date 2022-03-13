import java.util.Scanner;
public class Mrch7Assignment3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
//		WAP to swap two string variables without using third or temporary variable
		System.out.println("Enter string 1: ");
		String a=sc.nextLine();
		System.out.println("Enter string 2: ");
		String b=sc.nextLine();
		a=a+b;
		b=a.replace(b,"");
		a=a.replace(b,"");
		System.out.println("After replacing: ");
		System.out.println("String 1 = "+a);
		System.out.println("String 2 = "+b);	
	}

}
