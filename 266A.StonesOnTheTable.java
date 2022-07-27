package Start;
import java.util.Scanner;


public class StonesOnTheTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				String s = sc.next();
		 
			
				int counter = 0;
				char last = s.charAt(0);
		 
				for (int i = 1; i < n; i++) {
					if (s.charAt(i) == last) counter++;
					else last = s.charAt(i);
				}
		 
				
				System.out.println(counter);
	}

}
