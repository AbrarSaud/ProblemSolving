
// 200B – Drinks
// https://codeforces.com/problemset/problem/200/B
import java.util.Scanner;

public class Drinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner myObj = new Scanner(System.in);
		 int n = myObj.nextInt();
		 float   sum = 0;
		 int [] arr= new int[n];
		 for(int i=0; i< n ;i++) {
			arr[i] = myObj.nextInt();
			  sum +=  arr[i];
		 }
			System.out.println( sum / n ); 
	}

}
