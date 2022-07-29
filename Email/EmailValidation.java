package Email;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailValidation {
	private static final String regex ="^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	
	public static void main(String args[]) {
	
	String emails[]= {"sree@gmail.com","sun@gmail.com","moon@gmail.com"};
	
	System.out.println("Enter Email Id:");
	
	Scanner sc=new Scanner(System.in);
	String UserEmail=sc.next();
	Pattern pattern = Pattern.compile(regex);
	Matcher match =pattern.matcher(UserEmail);
	if (match.matches()) {
		System.out.println("The Email address is "  + (match.matches() ? "valid" : "invalid"));
	}
	else {
		System.out.println("The Email address is "  + (match.matches() ? "valid" : "invalid"));
	}
	for (int i=0;i<emails.length;i++) {
		if (match.matches()) {
			
		}
		if(emails[i].equals(UserEmail))
			System.out.println("Id Validated");
		else
			System.out.println("Invalid user");
	}

	}
}

