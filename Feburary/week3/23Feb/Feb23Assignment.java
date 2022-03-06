import java.util.Scanner;
public class Feb23Assignment {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		//		Write a program to print different courses needs to  be studied by students of diff.  years and branch
		System.out.println("Enter year: ");
		int year=Sc.nextInt();
		System.out.println("Enter branch: ");
		String branch=Sc.next();
		switch(year)
		{
			case 1:
				System.out.println("For first year every branch has same subjects");
				break;
				
				
			case 2:
			case 3:
			case 4:
				switch(branch) {
				case "IT":
				case "CSE":
					System.out.println("You have opted for computer subjects");
					break;
				case "ECE":
				case "EE":
					System.out.println("You have opted for electrical subjects");
					break;
				case "Mechanical":
					System.out.println("You have opted for mechanical subjects");
					break;
				case "Civil":
				System.out.println("You have opted for civil subjects");
				    break;
				default:
					System.out.println("Invalid input(unknown subject)");
					break;
				}
				break;
				default:
					System.out.println("Invalid input(year should be less than 5)");
				break;
		}
	}

}
