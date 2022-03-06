
public class Feb25Assignment3 {

	public static void main(String[] args) {
//		Pant's style Star Pattern
		for (int i=0;i<5;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print("*");
			}
			for (int k=1;k<=i;k++) {
				System.out.print("  ");
			}
			for(int l=4;l>=i;l--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
