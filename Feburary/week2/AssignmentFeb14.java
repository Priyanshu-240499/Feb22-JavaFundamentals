public class AssignmentFeb14 {
	public static void main(String[] args) {
		System.out.println("Left triangle method");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.println("Pyramid Pattern");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.print("\n");
		}
		
		System.out.println("inverse Pyramid Pattern");
		for (int i = 1; i<=6; i++) {
			for (int j = 6; j>i; j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.println("Numbers from 10 to 1 using while loop ");		
		int a=10;
		while (a>0) {
			System.out.println(a);
			a--;
		}
		
		System.out.println("Numbers from 1 to 100, divisible by 3");		
		for (int i=1;i<=100;i++) {
			if(i%3==0) {
				System.out.println(i);		
			}
		}
			
				
		
		

			
		

		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
