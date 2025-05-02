import java.util.Scanner;
public class task01 {
  public static void main(String [] args){
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Enter number: ");
    int number = sc.nextInt();
    
    int count = 0;
    int num = 2;
    
    while(count < number){
      boolean isPrime = true;
      
      for(int i = 2; i * i <= num; i++){
        if(num % i == 0){
          isPrime = false;
          break;
        }
      }
      if(isPrime) {
        System.out.println(num);
        count++;
      }
      num++;
    }
  }
}
