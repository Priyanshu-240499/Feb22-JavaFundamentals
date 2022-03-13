
public class March9Assignment1 {
	public static void main(String[] args) {
//  lower triangular matrix
		int arr[][]= {{ 2, 4, 4 }, { 8, 5, 7 }, { 4, 6, 9 } };
		int r=arr.length;
		int c=arr[0].length;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(i>=j) {
					System.out.print(arr[i][j]+" ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	
	}
}
