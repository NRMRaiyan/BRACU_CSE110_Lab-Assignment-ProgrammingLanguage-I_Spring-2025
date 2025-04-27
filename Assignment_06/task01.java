import java.util.Scanner;
public class task01
{
  public static void main(String[] args)
{
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter string : ");

    String inputtedString = sc.nextLine();
    
    String newCreatedString = "";
    int i = 0;
    
    while( i < inputtedString.length() )
	{
      
      char characterOfInputtedString = inputtedString.charAt( i );


      int asciiOfCharacterOfInputtedString = (int) characterOfInputtedString;
      
      if( asciiOfCharacterOfInputtedString > 96 && asciiOfCharacterOfInputtedString < 123 )
	{

        newCreatedString += (char) ( asciiOfCharacterOfInputtedString - 32 );

      }
	else
	{

        newCreatedString += characterOfInputtedString;
      }

      i++;
    }
    System.out.println( newCreatedString );
  }
}
