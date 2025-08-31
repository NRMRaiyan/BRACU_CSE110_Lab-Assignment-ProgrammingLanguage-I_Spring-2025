import java.util.Scanner;

public class task05_A{
  
  // Task 05_A
  public static void showDots(int numberOfDots){
    for(int i = 1; i <= numberOfDots; i++){
      System.out.print(".");
    }
  }
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the number of dots: ");
    int numberOfDots = sc.nextInt();
    
    showDots(numberOfDots);
    
  }
}
