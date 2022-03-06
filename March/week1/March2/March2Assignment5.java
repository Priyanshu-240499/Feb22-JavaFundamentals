import java.util.Scanner;
public class March2Assignment5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		Take multiplying factor from user and give the new array
		int count=0;
		int arr[]=new int[10];
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println("Enter array value "+i);
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter multipying factor: ");
		int d=sc.nextInt();
		System.out.println("New array is: ");
		for(int j=0;j<n;j++) {
			arr[j]*=d;
			System.out.print(arr[j]+" ");
		}
		
		



	}

}
