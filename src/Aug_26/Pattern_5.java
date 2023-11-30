package Aug_26;

import java.util.Scanner;

public class Pattern_5 {

	public static void main(String[] args) {
		int n,ascii;
		char ch;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the n value:");
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			ascii=97;
			ch='a';
			for(int sp=1;sp<i;sp++) {
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--) {
				System.out.printf("%c ",ascii);
			    ascii++;
			}
			System.out.println();
		}
		

	}

}
