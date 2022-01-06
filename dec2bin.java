import java.util.Scanner;
public class dec2bin {
	static int decToBin(int num) {
		int bin=0;
		int cnt = 0; 
	    while (num != 0)
	    { 
	        int rem = num % 2; 
	        double c = Math.pow(10, cnt); 
	        bin += rem * c; 
	        num /= 2; 

	        // Count used to store exponent value 
	        cnt++; 
	    } 

	    return bin; 
	} 
	public static void main(String args[]) {
		int n;
		System.out.println("Enter a decimal value:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(decToBin(n));
	}

}
