package A;
import java.util.Scanner;

public class SoldierAndBananas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan = new Scanner(System.in);
	        int cost = scan.nextInt();
	        int initialMoney = scan.nextInt();
	        int noBananas = scan.nextInt();
	 
	        int sum=cost;
	        for(int i=2;i<=noBananas;i++){
	            sum+=i*cost;
	        }
	        if(sum<=initialMoney){
	            System.out.println(0);
	            System.exit(0);
	        }
	        System.out.println(sum-initialMoney);
	}

}
