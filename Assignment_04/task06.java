import java.util.Scanner;
public class task06 {
  public static void main(String [] args){
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Enter input number: ");
    int inputs = sc.nextInt();
    
    int countEven = 0;
    int sumEven = 0;
    int maxEven = 0;
    int minEven = 0;
    
    int i = 0;
    while(i < inputs){
      int inputsLoop = sc.nextInt();
      i++;
      
      if(inputsLoop > 0 && inputsLoop % 2 == 0){
        if(countEven == 0){
          maxEven = inputsLoop;
          minEven = inputsLoop;
        }else{
          if(inputsLoop > maxEven){
            maxEven = inputsLoop;
          }
          if(inputsLoop < minEven){
            minEven = inputsLoop;
          }
        }
        
        sumEven += inputsLoop;
        countEven++;
      }
    }
    
    if(countEven > 0){
      System.out.println("Max: " + maxEven);
      System.out.println("Min: " + minEven);
      System.out.println("Average: " + (double) sumEven / countEven);
    }
  }
}
