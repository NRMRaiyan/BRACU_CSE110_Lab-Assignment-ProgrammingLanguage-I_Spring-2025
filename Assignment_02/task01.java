import java.util.Scanner;
public class main{
  public static void task01 (String [] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter number1: ");
    int number1 = sc.nextInt();
    System.out.println("Enter number2: ");
    int number2 = sc.nextInt();
    System.out.println("Enter number3: ");
    int number3 = sc.nextInt();
    
    if(number1 > number2 && number1 > number3){
      System.out.println("largest number: " + number1);
    }else if(number2 > number1 && number2 > number3){
      System.out.println("largest number: " + number2);
    }else{
      System.out.println("largest number: " + number3);
    }
  }
}
