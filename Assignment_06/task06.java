import java.util.Scanner;
public class task06
{
  public static void main(String[] args)
  {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the phrase : ");
    
    String inputPhrase = sc.nextLine();
    
    int vowelsCount = 0;
    int consonentsCount = 0;
    
    for(int i = 0; i < inputPhrase.length(); i++)
    {
      
      if(inputPhrase.charAt(i) == 'a' || inputPhrase.charAt(i) == 'e' || inputPhrase.charAt(i) == 'i' || inputPhrase.charAt(i) == 'o' || inputPhrase.charAt(i) == 'u'
           || inputPhrase.charAt(i) == 'A' || inputPhrase.charAt(i) == 'E' || inputPhrase.charAt(i) == 'I' || inputPhrase.charAt(i) == 'O' || inputPhrase.charAt(i) == 'U')
      {
        vowelsCount++;
      }
      else if(inputPhrase.charAt(i) == ' ' || inputPhrase.charAt(i) == '-' || inputPhrase.charAt(i) == '_' || inputPhrase.charAt(i) == '!' || inputPhrase.charAt(i) == '@' ||
               inputPhrase.charAt(i) == '$' || inputPhrase.charAt(i) == '.' || inputPhrase.charAt(i) == ',')
      {
        continue;
      }
      else
      {
        consonentsCount++;
      }
    }
    
    if(consonentsCount == 0 || vowelsCount == 0)
    {
      System.out.println("Blimey! No Plunder!!");
    }
    else if(vowelsCount % 3 == 0 && consonentsCount % 5 ==0)
    {
      System.out.println("Aaarr! Me Plunder!!");
    }
    else
    {
      System.out.println("Blimey! No Plunder!!");
    }
  }
}
