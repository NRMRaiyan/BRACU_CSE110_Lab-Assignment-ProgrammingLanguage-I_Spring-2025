import java.util.Scanner;

public class task05_C{
  
  // Task 05_A
  public static void showDots(int numberOfDots){
    for(int i = 0; i < numberOfDots; i++){
      System.out.print(".");
    }
  }
  
  // Task 05_B
  public static void show_palindrome(int inputFromMain){
    
    for(int i = 1; i <= inputFromMain; i++){
      System.out.print(i);
    }
    
    for(int i = inputFromMain - 1; i >= 1; i--){
      System.out.print(i);
    }
  }
  
  // Task 05_C
  public static void showDiamond(int numberInput){
    
    for(int i = 1; i < numberInput; i++){
      showDots(numberInput - i);
      show_palindrome(i);
      showDots(numberInput - i);
      System.out.println();
    }
    
    for(int i = numberInput; i >= 1; i--){
      showDots(numberInput - i);
      show_palindrome(i);
      showDots(numberInput - i);
      System.out.println();
    }
  }
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the number of dots: ");
    int numberOfDots = sc.nextInt();
    
    showDots(numberOfDots);
    
    System.out.println();
    
    show_palindrome(numberOfDots);
    
    System.out.println();
    
    showDiamond(numberOfDots);
    
  }
}
