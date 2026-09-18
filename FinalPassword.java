import java.util.Scanner;

public class FinalPassword
{
	public static void main(String [] args)
	{	
		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter your password: ");
		String password = kb.nextLine();
		
		if(isUpperCase(password) && isLowerCase(password) && isDigit(password) && isSpecialCharacter(password)){
			System.out.print("Your password is correct !!");
		}
		else
			System.out.print("Your password is incorrect !!");
		
		
	}
	
	public static boolean isUpperCase(String password)
	{   
	    int upperCount = 0 ;
		for(int i = 0 ; i < password.length() ; i++){
		    char ch = password.charAt(i);
			if(Character.isUpperCase(ch)){
				upperCount++;
			}  
			  
		}
		return 	upperCount >= 1;
	}
	
	public static boolean isLowerCase(String password)
	{	
		int lowerCount = 0;
		for(int c = 0 ; c < password.length() ; c++){
			char cs = password.charAt(c);
			
			if(Character.isLowerCase(cs)){
				lowerCount++;
			}
		}
		return lowerCount >= 3;
	}
	
	public static boolean isDigit(String password)
	{
		int digitCount = 0;
		for(int d = 0 ; d < password.length(); d++){
			char dh = password.charAt(d);
			if(Character.isDigit(dh)){
				digitCount++;
			}
		}
		return digitCount >= 2;
	}
	
	public static boolean isSpecialCharacter(String password)
	{	
		int specialCount = 0;
		for(int h = 0 ; h < password.length() ; h++){
			char cg = password.charAt(h);
			
			if(!Character.isLetterOrDigit(cg)){
				specialCount++;
			}
		}
		return specialCount >= 1;
	}
		
}

