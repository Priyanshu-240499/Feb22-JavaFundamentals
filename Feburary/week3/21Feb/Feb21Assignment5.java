import java.util.Scanner;
public class Feb21Assignment5 {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
//		Find the first 7 terms of the series (N*6N) where it is divisible by 6...
		System.out.println("First 7 terms of the series (N*6N) is ");
		int count=0;
		for(int N=1; count<7;N++) {
			int series=(N*6*N);
			if (series%6==0) {
				System.out.println(series);
			}
			count++;
		}
		

	}

}
