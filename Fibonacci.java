import java.util.Scanner;

public class Fibonacci {
	static void fib(int n)
    {
        int a = 0;
        int b = 1;
        if (n==a || n==b) { 
        	System.out.print(n + " is fibonacci");
        	return;
        }
        int c = a+b;
        while(c<=n)
        {
            if(c == n) {
            	System.out.print(n + " is fibonacci");
            	return;
            }
            a = b;
            b = c;
            c = a + b;
        }
        System.out.print(n + " is not fibonacci");
        return;
    }
	public static void main(String args[]) {
		int num;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		fib(num);
	}
}
