package Start;
import java.util.*;


public class Elephant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner myObj = new Scanner(System.in);
		  int n = myObj.nextInt();
            if(n % 5 ==0) {
            	 System.out.println(n / 5);
            }else
	            System.out.println( (n / 5) + 1);
	}

}
