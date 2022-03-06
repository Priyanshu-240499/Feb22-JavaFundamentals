
public class Feb24Assignment {

	public static void main(String[] args) {
//		Print triangle pattern
		System.out.println("Triangle pattern");
		for (int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
//		pyramid pattern
		System.out.println("Pyramid pattern");
		for (int i=1;i<=4;i++) {
			for (int j=3;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
//		diamond pattern
		System.out.println("diamond pattern");
		for (int i = 0; i < 9; i++) {
			if (i < 5) {
				for (int j = 3; j >= i; j--) {
					System.out.print(" ");
				}
				for (int k = 0; k <= i; k++) {
					System.out.print("* ");
				}
				System.out.println();

			} else {
				for(int l=5;l<=i;l++) {
					System.out.print(" ");
				}
				for(int m=8;m>=i;m--) {
					System.out.print("* ");
				}
				System.out.println();
			}

		}

	}

}
