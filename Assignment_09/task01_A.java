import java.util.Scanner;

public class task01_A{
  
  // Task01_A
  public static void oneToN(int number1, int number2){
    if(number1 > number2) return;
    
    System.out.print(number1 + " ");
    
    oneToN(number1 + 1, number2);
  }
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter value of N : ");
    int numberN = sc.nextInt();
    
    oneToN(1, numberN);
  }
}
