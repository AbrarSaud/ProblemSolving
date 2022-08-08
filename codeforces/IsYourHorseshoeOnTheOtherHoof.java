
// 228A - Is your horseshoe on the other hoof?
// https://codeforces.com/problemset/problem/228/A

import java.util.*;
import java.lang.*;

public class IsYourHorseshoeOnTheOtherHoof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner myObj = new Scanner(System.in);
			int n = myObj.nextInt();
			long a[]=new long[4];
			for(int i=0;i<4;i++)
			{
				a[i]=myObj.nextLong();
			}
			Arrays.sort(a);
			long c=0;
		
		for(int i=0;i<3;i++)
		{
			if(a[i]==a[i+1])
			{
				c++;
		} }
			System.out.println(c);	
	}

}
