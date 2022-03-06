import java.util.Scanner;
public class March2Assignment1 {

	public static void main(String[] args) {
//		Sum of all elements in array...........
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int arr[]=new int[10];
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println("Enter array value "+i);
			arr[i]=sc.nextInt();
		}
		
		for (int j=0;j<n;j++) {
			sum+=arr[j];
		}
		System.out.println("Sum of elements of arrays: "+sum);

	}

}
