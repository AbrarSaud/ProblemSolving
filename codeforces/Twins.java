package Start;

import java.util.Scanner;
import java.util.Arrays;


public class Twins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner myObj = new Scanner(System.in);

		 int n=myObj.nextInt();
	        int []a=new int[n];
	        int tot=0;
	        for(int i=0;i<n;i++){
	            a[i]=myObj.nextInt();
	            tot+=a[i];
	        }
	        tot=tot/2;
	        Arrays.sort(a);
	        int k=0,k1=0;
	        for(int i=n-1;i>0;i--)
	        {
	            k1+=a[i];
	            if(k1>tot)
	                break;
	            else
	                k++;
	        }
	        System.out.println(k+1);
		
	}

}
