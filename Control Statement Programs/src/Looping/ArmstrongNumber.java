package Looping;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num>0) {
			int lastdigit=num%10;
			sum=sum+(lastdigit*lastdigit*lastdigit);
			num=num/10;
		}
		if(sum==temp) {
			System.out.println("It is a Armstrong Number");
		}
		else {
			System.out.println("Not a Armstrong Number");
		}

	}

}
