package Looping;

import java.util.Scanner;

public class RecursiveFactorial {
	static int fact;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		RecursiveFactorial ob = new RecursiveFactorial();
		fact=ob.Fact(num);
		System.out.println("Factorial: "+fact);

	}
	int Fact(int num) {
		if(num>=1) 
		return	(num*Fact(num-1));
		return 1;
	}

}
