import java.util.Scanner;
public class March2Assignment3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		Printing even numbers................
		int arr[]=new int[10];
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println("Enter array value "+i);
			arr[i]=sc.nextInt();
		}
		System.out.print("All even numbers of the array are: ");
		for (int j=0;j<n;j++) {
			if(arr[j]%2==0) {
				System.out.print(arr[j]+" ");
			}
		}
	}

}
