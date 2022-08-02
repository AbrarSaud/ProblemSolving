package A;
import java.util.Scanner;

public class BearAndBigBrother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner myObj = new Scanner(System.in);
		 int c=0;
		 int a = myObj.nextInt();
		 int b = myObj.nextInt();
		 
		 if(a>b)
		        c=0;
		    else
		        while(a<=b)
		        {
		            a=a*3;
		            b=b*2;
		            c++;
		        }
		 System.out.println(c);
		 
		 
		 
	}

}
