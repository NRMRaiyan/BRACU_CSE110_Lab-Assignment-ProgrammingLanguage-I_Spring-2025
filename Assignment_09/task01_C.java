import java.util.Scanner;

public class task01_C{
  
  // Task01_A
  public static void oneToN(int number1, int number2){
      
      if(number1 > number2) return;
      
      System.out.print(number1 + " ");
      
      oneToN(number1 + 1, number2);
      
    }
  
  // Task01_B
  public static void nToOne(int number1, int number2){
      
    if(number1 < number2) return;
    
    System.out.print(number1 + " ");
    
    nToOne(number1 - 1, number2);

  }
  
  // Task01_C
  public static int recursiveSum(int number2){
      
    if(number2 == 1){
      return 1;
   	 }else{
   	     return number2 + recursiveSum(number2 - 1);
   	     }
   	}
   	
   	public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
   	System.out.println("Enter value of N : ") ;
    int numberN = sc.nextInt();
    
    oneToN(1, numberN);
    
   	System.out.println() ;
    
    nToOne(numberN, 1);
    
   	System.out.println() ;
    
    int answer = recursiveSum(numberN) ;
    
    System.out.println(answer) ;
  }
}
