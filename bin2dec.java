import java.util.Scanner;

public class bin2dec {
	static int binToDec(int num) {
		int dec=0,base=1,rem;
		while(num > 0)  
	    {  
	        rem = num % 10;   
	        dec = dec + rem * base;  
	        num /= 10;   
	        base = base * 2;  
	    }  
		return dec;
	}
	public static void main(String args[]) {
		int n;
		System.out.println("Enter a binary value:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(binToDec(n));
	}
}
