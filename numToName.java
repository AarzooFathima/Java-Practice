import java.util.Scanner;
public class numToName {

	public static void main(String[] args)
	{
		//String n = "270176";
		String n;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextLine();
	    int i, length = n.length();
		 
	    for (i = 0; i < length; i++)
	    {
	    	switch(n.charAt(i)) {
	    	case '0':
	            System.out.print("Zero ");
	            break;
	    	case '1':
	            System.out.print("One ");
	            break;
	    	case '2':
	            System.out.print("Two ");
	            break;
	    	case '3':
	            System.out.print("Three ");
	            break;
	    	case '4':
	            System.out.print("Four ");
	            break;    
	    	case '5':
	            System.out.print("Five ");
	            break;
	    	case '6':
	            System.out.print("Six ");
	            break;
	    	case '7':
	            System.out.print("Seven ");
	            break;
	    	case '8':
	            System.out.print("Eight ");
	            break;
	    	case '9':
	            System.out.print("Nine ");
	            break;
	    	}
	    }
	}
}
