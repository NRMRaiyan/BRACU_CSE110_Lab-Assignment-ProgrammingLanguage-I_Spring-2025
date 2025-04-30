import java.util.Scanner;
public class task05
{
  public static void main(String[] args)
  {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter string : ");
    
    String inputString = sc.nextLine();
    
    String reversedString = "";
    
    String newString = " ";
    
    int i = 0;
    
    while(i < inputString.length())
    {
      
      if( inputString.charAt(i) == newString.charAt(0) )
      {
        
        reversedString = newString + reversedString;
        newString = " ";
      }
      else
      {
        
        newString += inputString.charAt(i);      
      }
      i++;
    }
    
    reversedString = newString + reversedString;
    
    System.out.println(reversedString);
  }
}