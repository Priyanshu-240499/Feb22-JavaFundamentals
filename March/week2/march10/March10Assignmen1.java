import java.util.Scanner;
public class March10Assignmen1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("no.1");
		int a = sc.nextInt();
		int b =0;
		try {
			System.out.println(a / b); 
		} catch (ArithmeticException ex) {
			System.out.println("Exception occured");
		}
		finally {
			System.out.println("Their is an error in code");
		}	
	}
}
