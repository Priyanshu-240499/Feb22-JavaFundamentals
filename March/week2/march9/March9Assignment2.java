public class March9Assignment2 {
	public static void main(String[] args) {
//		Determine if given matrix is Sparse matrix....
		int arr[][]= {{ 2, 0, 4 }, { 0, 5, 0 }, { 0, 0, 9 } };
		int r=arr.length;
		int c=arr[0].length;
		int count=0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(arr[i][j]==0) {
					count++;
				}		
			}
		}
		if(count>(r*c)/2) {
			System.out.println("Sparse matrix");
		}
		else {
			System.out.println("Not a Sparse matrix");
		}		
	}
}
