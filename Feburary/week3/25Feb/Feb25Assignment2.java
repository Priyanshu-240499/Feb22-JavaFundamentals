
public class Feb25Assignment2 {

	public static void main(String[] args) {
//		Inverted v star pattern
		for (int i = 0; i < 5; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i;) {
				System.out.print("* ");
				k++;
				if(k>1) {
					break;
				}
			}
			for(int l=2;l<=i;l++) {
				System.out.print("  ");	
			}

			for(int m=0;m<=0;m++) {
			System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
