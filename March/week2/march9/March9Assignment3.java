
public class March9Assignment3 {

	public static void main(String[] args) {
		int arr[][]= {{ 2, 4, 4 }, { 8, 5, 7 }, { 4, 6, 9 } };
		int r=arr.length;
		int c=arr[0].length;
		int counteven=0;
		int countodd=0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(arr[i][j]%2==0) {
					counteven++;
				}
				else {
					countodd++;
				}
			}
		}
		System.out.println("Frequency of even numbes is: "+counteven);
		System.out.println("Frequency of odd numbers is: "+countodd);

	}

}
