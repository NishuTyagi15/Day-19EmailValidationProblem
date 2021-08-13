package emailpatternproblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validateEmail {
	public static void main(String[] args) {
		System.out.println("Enter your E-mail: ");
	    String email = new Scanner(System.in).next();
	     
	    String regex = "^[A-Za-z0-9+_.-]+@+(?:[a-zA-Z]+\\.)+[a-zA-Z]{2,4}$";
	     
	    Pattern pattern = Pattern.compile(regex);    
	    Matcher matcher = pattern.matcher(email); 
	     
	    System.out.println(email +" : "+ matcher.matches());
	}
}