package Looping;

import java.util.Scanner;

public class isPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int temp=num;
		int rev=0,rem;
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(rev==num) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not a Palindrome Number");
		}

	}
}
