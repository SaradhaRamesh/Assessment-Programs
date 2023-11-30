package Aug_26;

import java.util.Scanner;

public class Pattern_7 {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the value of n:");
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int sp=n;sp>=i;sp--) {
				System.out.print(" ");
			}
			for(int k=i+0;k>1;k--) {
				System.out.print(k);
			}
			
			
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	s.close();	
	}
}
