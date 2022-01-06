import java.util.*; 
public class sumOfPrimes {
	static boolean checkPrime(int num)
    {
        if(num == 1) {
            return false;
        }
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
	
	static int primeSum(int n,int m) {
		int sum=0;
		for(int i=n; i<=m; i++) {
			boolean isPrime = checkPrime(i);
            if (isPrime) {
                sum = sum + i;
            }
        }
        return sum;
	}
	
	public static void main(String args[]) {
		int n,m;
		System.out.println("Enter a range:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		System.out.println(primeSum(n, m));
	}
}
