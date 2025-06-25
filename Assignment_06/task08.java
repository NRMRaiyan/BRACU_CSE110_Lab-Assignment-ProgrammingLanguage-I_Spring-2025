import java.util.Scanner;
public class task08
{
  public static void main(String[] args)
  {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter string :");
    
    String inputString = sc.nextLine();
    
    int characterCount = 0;
    
    int i = 0;
    
    while(i < inputString.length())
    {
      
      char eachCharacter = inputString.charAt(i);
      
      if ((eachCharacter >= 'a' && eachCharacter <= 'z') || (eachCharacter >= 'A' && eachCharacter <= 'Z'))
      {
        
        if (characterCount % 2 == 0)
        {
          
          if (eachCharacter >= 'A' && eachCharacter <= 'Z')
          {
            eachCharacter = (char)(eachCharacter + 32);
          }
        }
        else
        {
          if (eachCharacter >= 'a' && eachCharacter <= 'z')
          {
            eachCharacter = (char)(eachCharacter - 32);
          }
        }
        characterCount++;
      }

      System.out.print(eachCharacter);
      i++;
    }

  }

}
