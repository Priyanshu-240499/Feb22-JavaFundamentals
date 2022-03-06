import java.util.Scanner;
public class March2Assignment4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		Count all even numbers of an array
		int count=0;
		int arr[]=new int[10];
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println("Enter array value "+i);
			arr[i]=sc.nextInt();
		}
		System.out.print("Count of all even numbers of array is: ");
		for (int j=0;j<n;j++) {
			if(arr[j]%2==0) {
				count++;
			}
		}
		System.out.println(count);



	}

}
