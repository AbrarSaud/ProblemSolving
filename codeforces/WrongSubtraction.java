
///977A - Wrong Subtraction
/// https://codeforces.com/problemset/problem/977/A
import java.util.Scanner;
public class WrongSubtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner myObj = new Scanner(System.in); 
		 int n = myObj.nextInt();
		 int k = myObj.nextInt();
		 
		 for(int i=0; i < k ;i++) {
			 if (n %10 == 0) {
				n /= 10; 
				 
			 } else {
			 n-=1;
		 }}
			System.out.println(n);

		 
	}

}
