package selectionStatementsPrograms;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number from 1 to 4");
		int num=sc.nextInt();
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		switch(num) {
		case 1:
			System.out.println("Addition: "+a+b);
			break;
		case 2:
			System.out.println("Subtraction: "+(a-b));
			break;
		case 3:
			System.out.println("Multiplication: "+a*b);
			break;
		case 4:
			System.out.println("Division: "+(float)a/(float)b);
			break;
		default:
			System.out.println("Enter Right Choice");
		}
	}

}
