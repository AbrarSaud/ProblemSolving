package Start;
import java.util.Scanner;


public class WordCapitalization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		String  word = myObj.next();
		  
		  if(Character.isUpperCase(word.charAt(0))) 
		        
	            System.out.println(word);
	        if(Character.isLowerCase(word.charAt(0)))
	            System.out.println(Character.toUpperCase(word.charAt(0))+word.substring(1));
	}

}
