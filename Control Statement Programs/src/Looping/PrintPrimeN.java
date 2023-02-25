package Looping;

import java.util.Scanner;

public class PrintPrimeN {

	public static void main(String[] args) {
	int temp=0;
	for(int num=1;num<=100;num++) {
		for(int i=2;i<=num-1;i++) {
			if(num%i==0) {
				temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.print(num+" ");
		}
		else {
			temp=0;
		}
	}
	}

}
