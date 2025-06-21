import java.util.Scanner ;

public class task03
{
  
  // Task 03
  public static int sumDigits(int numberN)
	{
    if(numberN == 0)
	{
      return 0 ;
    }
	else if(numberN == 1)
	{
      return 1 ;
    }

    return (numberN % 10) + sumDigits(numberN / 10);
  }
  
  public static void main(String[] args)
{
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter number N : ");

    int numberN = sc.nextInt();

    int finalAnswer = sumDigits(numberN);

    System.out.println(finalAnswer);
    
  }
}
