package Start;
import java.util.Scanner;

public class GeorgeAndAccommodation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner myObj = new Scanner(System.in);

		 int n=myObj.nextInt();
		    int result=0;
		    for(int i=0;i<n;i++){
		        int j=myObj.nextInt();
		        int k=myObj.nextInt();
		        if((k-j)>=2)
		            result++;
		    }
		    System.out.println(result);
	}

}
