import java.util.Scanner;

public class task05{
  // Task 05
  public static int factorial(int numberN)
{
    if(numberN < 1) return 1;
    
    return numberN * factorial(numberN - 1);

  }
  
  public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the number : ");

    int numberN = sc.nextInt();
    
    int finalAnswer = factorial(numberN);
    
    System.out.println(finalAnswer);
  }
}
