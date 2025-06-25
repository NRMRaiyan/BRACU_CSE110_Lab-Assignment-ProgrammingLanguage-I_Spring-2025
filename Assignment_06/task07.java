import java.util.Scanner;
public class task07
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter first string:");
    
    String inputString1 = sc.nextLine();
    
    System.out.println("Enter second string:");
    
    String inputString2 = sc.nextLine();
    

    for(int i = 0; i < inputString1.length(); i++)
    {
      
      char character1 = inputString1.charAt(i);
      
      boolean commonCharacterFound = false;
      
      for(int j = 0; j < inputString2.length(); j++)
      {
        
        char character2 = inputString2.charAt(j);
        
        if(character1 == character2)
        {
          
          commonCharacterFound = true;
          
          break;
        }
      }
      
      if(!commonCharacterFound)
      {
        
        System.out.print((char)((int)character1 - 32));
      }
    }
    
    for(int i = 0; i < inputString2.length(); i++)
    {
      
      char character2 = inputString2.charAt(i);
      
      boolean commonCharacterFound = false;
      
      for(int j = 0; j < inputString1.length(); j++)
      {
        char character1 = inputString1.charAt(j);
        
        if(character2 == character1)
        {
          
          commonCharacterFound = true;
          
          break;
        }
      }
      
      if(!commonCharacterFound)
      {
        System.out.print((char)((int)character2 - 32));
      }
    }
  }
}
