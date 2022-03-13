public class March8Assignment {
//	Sum of two 2d arrays
	public static void main(String args[]) {
		int arr1[][]= {{1,2,3,4},{5,6,7,8},{2,8,5,7}};
		int arr2[][]= {{4,5,2,8},{2,9,3,7},{5,6,7,8}};
		int r = arr1.length;
		int c = arr1[0].length;
//		As size of two arrays are similar,value of r and c is same for both
		boolean b = false;
		int product = 1;
		int sum[][]=new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				sum[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}
}
