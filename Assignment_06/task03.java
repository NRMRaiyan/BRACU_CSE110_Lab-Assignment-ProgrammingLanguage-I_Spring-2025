import java.util.Scanner;
public class task03
{
  public static void main(String[] args)
{
    
    Scanner sc = new Scanner(System.in);
    
     System.out.println("Enter string : ");

     String inputtedString = sc.nextLine();
    
     String newlyGeneratedString = "";
     
     int i = inputtedString.length() - 1;
    
      while(i > -1)
 {
      
        char characterOfInputtedString = inputtedString.charAt( i );
      
        newlyGeneratedString += characterOfInputtedString;
        
       i--;
    }
      
       if( newlyGeneratedString.equals(inputtedString) )
 {
         System.out.println("true");
       }
 else
 {
         System.out.println("false");
       }
  }
}