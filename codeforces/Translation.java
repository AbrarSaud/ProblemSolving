package A;
import java.util.Scanner;

public class Translation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		      Scanner myObj = new Scanner(System.in);
				String s = myObj.next();
				String t = myObj.next();
				String rev = "";
				for(int i=s.length()-1; i>=0; i--){
				    rev += s.charAt(i);
				}
				if(t.equals(rev))
				    System.out.println("YES");
				else
				    System.out.println("NO");
			}
		
	}


