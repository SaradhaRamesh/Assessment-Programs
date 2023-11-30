package Aug_26;

import java.util.Scanner;

public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=1;
		Scanner s =new Scanner(System.in);
		System.out.print("Enter the n value:");
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int sp=n;sp>=i;sp--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(sum+" ");
				sum++;
			}
			System.out.println();
		}
	}

}
