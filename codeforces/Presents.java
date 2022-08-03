package Start;
import java.util.*;

public class Presents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner myObj = new Scanner(System.in);
		 int n=myObj.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=myObj.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if((a[j]-1)==i)
					{
					System.out.print(j+1+" ");
					break;
					}
				}
			}
		
		
	}

}
