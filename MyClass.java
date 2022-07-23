package Start;
import java.util.*;
class MyClass {
	
		
public static void main(String[] args) {
	
   
	 Scanner myObj = new Scanner(System.in);
		int n = myObj.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]= myObj.nextLong();
		}

		if(n<3){
			System.out.println(0);
		}else{
			Arrays.sort(arr);
			System.out.println(arr[n-4]*arr[n-4]);
		}
  
   } 
   
  
   }
  


