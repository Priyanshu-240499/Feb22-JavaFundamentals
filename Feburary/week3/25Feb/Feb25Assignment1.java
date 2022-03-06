public class Feb25Assignment1 {

	public static void main(String[] args) {
//		solid half diamond pattern
		for(int i=0;i<9;i++) {
			if(i<5) {
				for(int j=0;j<=i;j++) {
					System.out.print("* ");
				}
			System.out.println();
			}
			else {
				for(int k=8;k>=i;k--) {
					System.out.print("* ");
				}
				System.out.println();
					
			}
			
		}
	}

}
