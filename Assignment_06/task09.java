import java.util.Scanner;
public class task09
{
  public static void main(String[] args)
  {
  
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter password : ");

    String inputPassword = sc.nextLine();
    
    boolean hasUpperCase = false;
    boolean hasLowerCase = false;
    boolean hasDigits = false;
    boolean hasSpecialCharacter = false;
    boolean isLong = false;
    
    if(inputPassword.length() >= 8)
    {
      
      isLong = true;
      int i = 0;
      
      while(i < inputPassword.length())
      {
        char eachCharacterInPassword = inputPassword.charAt(i);
        
        if(eachCharacterInPassword >= 'A' && eachCharacterInPassword <= 'Z')
        {
          hasUpperCase = true;
        }
        else if(eachCharacterInPassword >= 'a' && eachCharacterInPassword <= 'z')
        {
          hasLowerCase = true;
        }
        else if(eachCharacterInPassword >= '0' && eachCharacterInPassword <= '9')
        {
          hasDigits = true;
        }
        else if(eachCharacterInPassword >= ' ' && eachCharacterInPassword <= '@')
        {
          hasSpecialCharacter = true;
        }
        i++;
      }
    }
    
    if(isLong == true && hasUpperCase == true && hasLowerCase == true && hasDigits == true && hasSpecialCharacter == true)
    {
      System.out.println("True");
    }

    else
    {
      System.out.println("False");

    }
  }
}
