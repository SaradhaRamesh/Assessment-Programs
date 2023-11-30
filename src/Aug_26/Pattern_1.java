package Aug_26;

import java.util.Scanner;

public class Pattern_1 {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the n value:");
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>n-i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		s.close();
	}

}
