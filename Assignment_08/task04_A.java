import java.util.Scanner;

public class task04_A{
  
  // Task 04_A
  public static boolean isPrime(int checkPrime){
    for(int i = 2; i < checkPrime; i++){
      if(checkPrime % i ==0) return false;
    }
    return true;
  }
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the number: ");
    int numberInput = sc.nextInt();
    
    isPrime(numberInput);
    
    System.out.println(isPrime(numberInput));
  }
}
