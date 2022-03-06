import java.util.Scanner;
public class March2Assignment2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		Find middle element in array.............
		int arr[]=new int[10];
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println("Enter array value "+i);
			arr[i]=sc.nextInt();
		}
		System.out.println("Middle element of array is: "+arr[(n-1)/2]);


	}

}
