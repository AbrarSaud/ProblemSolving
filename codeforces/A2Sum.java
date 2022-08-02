

import java.util.Scanner;

public class A2Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner myObj = new Scanner(System.in);
		 
		
			
			 int n = myObj.nextInt();
			 int sum = myObj.nextInt();
			 int [] arr  = new int[n];
			 String   s ="NO";
		 
		        for (int i = 0; i < n; i++) {
		        	arr[i] = myObj.nextInt();
		            
		        }
		    
		    for (int i = 0; i < n; ++i)
		    {
		        for (int j = i+1; j < n; ++j)
		        {
		            if (arr[i]+arr[j]==sum)
		            {
		               s = "YES" ;
		            }
		        }
		    }
	
		    System.out.println(s);		
	}

}
