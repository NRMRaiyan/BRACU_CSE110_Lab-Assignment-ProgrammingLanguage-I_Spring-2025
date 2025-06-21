import java.util.Scanner;

public class task06
{
  // Task 06
  public static int power(int base, int exponent)
{
    if(exponent < 1) return 1;

    return base * power(base, exponent - 1);

  }
  
  public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter value of base : ");

    int base = sc.nextInt();
    
    System.out.println("Enter value of exponenet : ");

    int exponent = sc.nextInt();
    
    int answer = power(base, exponent);

    System.out.println(answer);
  }
}
