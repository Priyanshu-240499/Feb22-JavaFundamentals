	import java.util.Scanner;
public class march4Asiignment3 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter string one:");
			String s1=sc.nextLine();
			System.out.println("Enter string two:");
			String s2=sc.next();
			if(s1.contains(s2)) {
				System.out.println("Found");
			}
			else {
				System.out.println("Not found");
			}
			

		}

	}


