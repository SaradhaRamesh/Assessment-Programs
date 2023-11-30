package Aug_26;

import java.util.Scanner;

public class Pattern_4 {

	public static void main(String[] args) {
		int n;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the n value:");
		n=s.nextInt();
		for(int i=1;i<n;i++) {
			for(int sp=1;sp<i;sp++) {
				System.out.print(" ");
							}
			for(int j=n;j>=i;j--) {
				System.out.print("* ");
							}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int sp=n;sp>i;sp--) {
				System.out.print(" ");
							}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
							}
			System.out.println();
		}

	}

}
