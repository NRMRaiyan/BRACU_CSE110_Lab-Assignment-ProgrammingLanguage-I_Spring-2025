import java.util.Scanner;

public class task04_C{
  
  // Task 04_A
  public static boolean isPrime(int checkPrime){
    for(int i = 2; i < checkPrime; i++){
      if(checkPrime % i ==0) return false;
    }
    return true;
  }
  
  // Task 04_B
  public static boolean isPerfect(int checkPerfect){
    int perfectSum = 0;
    
    for(int i = 1; i < checkPerfect; i++){
      if(checkPerfect % i == 0) perfectSum += i;
    }
    if(perfectSum == checkPerfect) return true;
    else return false;
  }
  
  // Task 04_C
  public static int special_sum(int numberInput){
    int sum = 0;
    for(int i = 2; i < numberInput; i++){
      if(isPrime(i) || isPerfect(i)) sum += i;
    }
    return sum;
  }
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the number: ");
    int numberInput = sc.nextInt();
    
    isPrime(numberInput);
    isPerfect(numberInput);
    special_sum(numberInput);
    
    System.out.println(isPrime(numberInput));
    System.out.println(isPerfect(numberInput));
    System.out.println(special_sum(numberInput));
  }
}
