package Looping;

public class RecursionFiboncci {
	static int a=0,b=1,c;
	public static void main(String[] args) {
		System.out.print(" "+a+" "+b);
		RecursionFiboncci ob = new RecursionFiboncci();
		ob.printFiboncci(10);

	}
	void printFiboncci(int num) {
		if(num>=1) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			printFiboncci(num-1);	
		}
	}

}
