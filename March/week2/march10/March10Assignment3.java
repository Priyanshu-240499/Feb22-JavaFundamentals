import java.util.Scanner;
public class March10Assignment3 {
//		Nested try statements
	public  static void divarr(int arr[],int a,int b) {
		try {
		try{
			System.out.println(arr[a]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("catch 1");
			System.out.println(e.toString());
		}
		try {
			System.out.println("result "+arr[a]/arr[b]);
		}
		catch(ArithmeticException e) {
			System.out.println("catch 2");
			System.out.println(e.toString());
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("hey ya");

			System.out.println(e.toString());
		}	
		catch(ArithmeticException e) {
			System.out.println("hahaha");
			System.out.println(e.toString());
		}
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index no.1");
		int num1=sc.nextInt();
		System.out.println("Enter index no.2");
		int num2=sc.nextInt();
		int arr[]= {1,2,3,4,5};
		 divarr(arr,num1,num2);
	}
		

	

}
