//Group (100 Easy Problems)  A. Profits
//https://codeforces.com/group/yg7WhsFsAp/contest/355499/problem/A
import java.util.Scanner;
public class Profits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner myObj = new Scanner(System.in);
		 int d = myObj.nextInt();
		 int   sum = 0;
		 int n = myObj.nextInt();
		 int [] arr= new int[d];
		 for(int i=0; i< d ;i++) {
			arr[i] = myObj.nextInt();
			  sum +=  arr[i];
		 }
			System.out.println( sum - n ); 
	}

}
