
// 486A - Calculating Function
// https://codeforces.com/problemset/problem/486/A
import java.util.*;
import java.lang.*;
public class CalculatingFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner myObj = new Scanner(System.in);
  long f =  myObj.nextLong();
  long Fun ;
		
		
  if (f %2 == 0) Fun = f/2;
	else Fun = (-1)*(f/2 + 1);
	
	// Output
	System.out.println(Fun);
		
	}

}
