import java.util.Scanner;

public class task10
{
  public static void main(String[] args)
  {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter first name : ");
    
    String firstNameInput = sc.nextLine();
    
    int nameLength = firstNameInput.length();
    
    System.out.println("Enter email password : ");
    
    String emailPasswordInput = sc.nextLine();
    int passwordLength = emailPasswordInput.length();
    boolean validPassword = false;
    
    if(passwordLength > nameLength)
    { 
      int i = 0;
      
      while(i < passwordLength) 
      {  
      char eachCharacterInPassword = emailPasswordInput.charAt(i);
      
      if(eachCharacterInPassword == firstNameInput.charAt(0))
      {
        
        validPassword = true;
        
        int indexChar = i;
        
        int j = 0;
        
        while(j < nameLength)
        {
          
          char checkCharacterPassword = emailPasswordInput.charAt(indexChar);
          char checkCharacterName = firstNameInput.charAt(j);
        
          if(checkCharacterPassword != checkCharacterName)
          {
            validPassword = false;
            break;
          }
          indexChar++;
          j++;
        }
        
        if(validPassword == true) break;
      }
        i++;
      }
      
    if(validPassword == true)
    {
      System.out.println("Invalid");
    }
    else
    {
      System.out.println("Valid");
    }
    }
    else
    {
      System.out.println("Enter a password of more than your name's length"); 
    }
  }
}
