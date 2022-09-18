// 427A - Police Recruits
// https://codeforces.com/problemset/problem/427/A

import java.util.Scanner;

public class PoliceRecruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner myObj = new Scanner(System.in); 

		 int events = myObj.nextInt();
		int police =0;
		int crime =0;
		
		for(int i=0; i< events; i++) {
			 int event = myObj.nextInt();
        
			 if( event == -1) {
				 if(police ==0 ) {
					 crime ++;
				 }else {
					 
					 police--;	 
				 }
			
			 }else {
				 police += event;
			 }
		
			
		}
		
		
		System.out.println(crime);

	}

}
