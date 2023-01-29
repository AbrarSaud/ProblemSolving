import java.util.Scanner;
 
public class VasyaTheHipster {
 
	public static void main(String[] args) {
		
		 Scanner myObj = new Scanner(System.in); 
		 int a = myObj.nextInt();
		 int b = myObj.nextInt();
		
		 
		 if(a > b) {
			 System.out.print( b +" "); 
		 } else {
				 System.out.print(a  +" ");  
	}
		 
    int ans = (a-b);
    System.out.print(ans /2); 
    
    
    
} }