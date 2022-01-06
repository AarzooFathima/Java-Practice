import java.util.Scanner;
public class LinearSearch {
	static int lSearch(int arr[], int key) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String args[]) {
		int n;
		System.out.println("Enter the size of array:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[10];
		System.out.println("Enter the elements of array:");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		int key;
		System.out.println("enter the key to be searched in the array:");
		key = sc.nextInt();
		int res = lSearch(arr,key);
		if(res == -1) {
			System.out.println(key + " is not present in the array");
		}
		else {
			System.out.println(key + " is present in the array at index, " + res);
		}
	}
}
