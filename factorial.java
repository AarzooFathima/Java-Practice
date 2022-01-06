import java.util.Scanner;
public class factorial {
	static int fact(int n)
	{
	   if(n == 0)
	      return(1);
	 
	   return(n*fact(n-1));
	}
	public static void main(String args[]) {
		int n;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.print("Factorial : " + fact(n));
	}
}
