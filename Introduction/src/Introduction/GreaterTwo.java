package Introduction;

import java.util.Scanner;

public class GreaterTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b)
			System.out.println("Greater: "+a);
		else
			System.out.println("Greater: "+b);
	}

}
