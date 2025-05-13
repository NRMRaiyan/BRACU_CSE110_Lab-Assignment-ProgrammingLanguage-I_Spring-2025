import java.util.Scanner;

public class task01_C
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
  
  // Task 01_B
  public static boolean isEven(int numberToCheck){
    if(numberToCheck % 2 == 0) return true;
    else return false;
  }
  
  // Task 01_C
  public static boolean isPos(int numberToCheck){
    if(numberToCheck >= 0) return true;
    else return false;
  }
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    

    System.out.println("Enter number to check : ");



    int numberToCheck = sc.nextInt();
    


    evenChecker(numberToCheck);
    isEven(numberToCheck);
    isPos(numberToCheck);
    

    System.out.println(evenChecker(numberToCheck));


    System.out.println(isEven(numberToCheck));
    System.out.println(isPos(numberToCheck));


  }
}
