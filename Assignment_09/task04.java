import java.util.Scanner;

public class task04
{
  // Task 04
  public static String reverse_string(String stringS, int index)
{
    if(index == stringS.length()) return "";
    
    return reverse_string(stringS, index + 1) + stringS.charAt(index);
  }
  
  public static void main(String[] args)

	{
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter string : ");

    String stringS = sc.nextLine();
    
    String finalAnswer = reverse_string(stringS, 0) ;

    System.out.println(finalAnswer);
  }
}
