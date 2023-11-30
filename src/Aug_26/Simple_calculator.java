package Aug_26;

import java.util.Scanner;

public class Simple_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		char c;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the first number:");
		a=s.nextInt();
		System.out.println("Enter the Second number:");
		b=s.nextInt();
		System.out.print("+ - * /  %");
		System.out.print("choose the operator");
		c=s.next().charAt(0);
		switch(c){ 
		case '+' :
		System.out.print(a+b);
		break;
		case '-':
		System.out.print(a-b);
		break;
		case '*' :
			System.out.print(a*b);
			break;
		case '/':
			System.out.print(a/b);
			break;
		case '%':
			System.out.print(a/b);
			break;
			default:
				System.out.print("opertors only...");
			
		
	 }
	}
}
