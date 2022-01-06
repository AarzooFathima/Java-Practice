import java.util.Scanner;
public class amount2Words {
	public static void main(String args[]) {
		//String n = "1234";
		String n;
		System.out.println("Enter a value:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextLine();
	    int length = n.length();
		
	    if(length == 0)
	    	System.out.println("The String is empty");
	    else {
	    
	    	String[] onedigit = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
	    
	    	String[] twodigits = new String[] {"", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
	    
	    	String[] multipleoftens = new String[] {"", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"}; 
	    
	    	String[] poweroftens = new String[] {"Hundred", "Thousand"};  
	    
	    	if (length == 1)   
	    	{  
	    		System.out.println(onedigit[n.charAt(0)-'0']);   
	    	}
	    	else {
	    		int i=0;
	    	
	    		while(i<n.length()) {
	    			if (length >= 3)   
	    			{  
	    				if (n.charAt(i)- '0' != 0)   
	    				{  
	    					System.out.print(onedigit[n.charAt(i) - '0'] + " ");   
	    					System.out.print(poweroftens[length - 3]+ " ");  
	    				} 
	    				--length;  
	    			}  
	    		  
	    			else   
	    			{       
	    				if (n.charAt(i) - '0' == 1)   
	    				{  
	    					int sum = n.charAt(i) - '0' + n.charAt(i+1) - '0';  
	    					System.out.println(twodigits[sum]+ " ");
	    				}
	    				else if (n.charAt(i) - '0' == 2 && n.charAt(i+1) - '0' == 0)   
	    				{    
	    					System.out.println("Twenty");  
	    					return;  
	    				}  
	    				else   
	    				{  
	    					int j = (n.charAt(i) - '0');  
	    					if (j > 0)  
	    						System.out.print("and "+multipleoftens[i]+ " ");  
	    					else  
	    						System.out.print(" ");  
	    	 
	    					++i;   
	    					if (n.charAt(i) - '0' != 0)   
	    						System.out.println(onedigit[n.charAt(i) - '0']+ " only");  
	    				}
	    			}
	    			++i;
	    		}
	    	}
	    }
	}
}
