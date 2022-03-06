import java.util.Scanner;
public class march4Assignment1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s1=sc.nextLine();
		System.out.println("Enter Word that has to be removed:");
		String s2=sc.nextLine();
		String result=s1.replace(s2, " ");
		System.out.println(result);	
	}
}
