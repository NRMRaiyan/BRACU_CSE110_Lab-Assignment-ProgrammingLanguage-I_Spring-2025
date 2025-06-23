import java.util.Scanner;
public class main {
  public static void main(String [] args){
    
    Scanner sc = new Scanner (System.in);
    
    while(true){
      System.out.println("Enter number: ");
      int number = sc.nextInt();
      
      if(number % 2 != 0){
        break;
      }
      
      int divisorCount = 0;
      
      for(int i = 1; i <= number; i++){
        if(number % i == 0){
          divisorCount++;
        }
      }
      System.out.println(number + " has " + divisorCount + " divisors");
    }
  }
}
