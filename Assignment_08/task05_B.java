import java.util.Scanner;

public class task05_B{
  
  // Task 05_A
  public static void showDots(int numberOfDots){
    for(int i = 1; i <= numberOfDots; i++){
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
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the number of dots: ");
    int numberOfDots = sc.nextInt();
    
    showDots(numberOfDots);
    
    System.out.println();
    
    show_palindrome(numberOfDots);
    
  }
}
