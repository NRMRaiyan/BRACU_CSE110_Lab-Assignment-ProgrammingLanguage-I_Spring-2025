import java.util.Scanner;

public class task01_A
{
  
  // Task 01_A
  public static String evenChecker(int numberToCheck)
{

    if(numberToCheck % 2 == 0)
{

      return "Even!";
    }

    else
{

      return "Odd!";
    }

  }
  
  public static void main(String[] args)
{
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter number to check : ");

    int numberToCheck = sc.nextInt();
    
    evenChecker(numberToCheck);

    System.out.println(evenChecker(numberToCheck));
  }
}
