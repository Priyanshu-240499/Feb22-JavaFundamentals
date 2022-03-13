import java.util.Scanner;

public class March10Assignment2 {
//   Use try and catchfor Exception handling
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("no.1");
		int a = sc.nextInt();
		int b =0;
		try {
			System.out.println(a / b); 
		} catch (Exception ex) {
			System.out.println("Exception occured");
			System.out.println(ex.getMessage());
		}
	}

}
