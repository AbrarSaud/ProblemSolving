// 405A - Gravity Flip
// https://codeforces.com/problemset/problem/405/A
import java.util.*; 
import java.util.Arrays;

public class GravityFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		int n = myObj.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=myObj.nextInt();
		}
		Arrays.sort(a);
	
	
	for(int i=0;i< n-1 ;i++)
	{
		System.out.print(a[i] +" ");
	
	}
	System.out.println(a[n-1]);

		
		
		
		
		
		
		
	}

}
