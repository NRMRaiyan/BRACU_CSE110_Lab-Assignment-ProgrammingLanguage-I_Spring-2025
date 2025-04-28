import java.util.Scanner;

public class task04
{
  public static void main(String[] args)
  {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter string : ");
    
    String inputtedString = sc.nextLine();
    
    System.out.println("Enter next line identifier : ");
    
    String nextLineIdentifier = sc.next();
    
    String emptyString = "";
    
    int i = 0;
    
    while(i < inputtedString.length())
    {
      
      if(inputtedString.charAt(i) == nextLineIdentifier.charAt(0))
      {
        
        System.out.println(emptyString);
        
        emptyString = "";
      }
      else
      {
        
        emptyString += inputtedString.charAt(i);
      }
      i++;
    }
    
    System.out.println(emptyString);
  }
}