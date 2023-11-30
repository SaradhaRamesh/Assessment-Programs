package Aug_26;

import java.util.Scanner;

public class Pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the n value:");
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int sp=1;sp<=i;sp++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==1||j==n)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
