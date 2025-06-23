import java.util.Scanner;
public class task08{
  public static void main(String [] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Start: ");
    int start = sc.nextInt();
    System.out.println("End: ");
    int end = sc.nextInt();
    
    System.out.println("Armstrong numbers: ");
    
    for(int num = start; num <= end; num++){
      
      int original = num;
      int digits = 0;
      int sum = 0;
      int temp = num;
      
      while(temp > 0){
        digits++;
        temp /= 10;
      }
      
      temp = num;
      
      while(temp > 0){
        
        int digit = temp % 10;
        
        int power = 1;
        
        for(int i = 1; i <= digits; i++){
          power *= digit;
        }
        
        sum += power;
        temp /= 10;
      }
      
      if(sum == original){
        System.out.println(original);
      }
    }
  }
}
