import java.util.Scanner;

public class task02{
  
  // Task 02
  public static void reverseDigits(int numberN){

    if(numberN == 0) return ;
   	System.out.println(numberN % 10) ;
   	
   	reverseDigits(numberN / 10) ;

  }
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter number N : ");

    int numberN = sc.nextInt();
    
    reverseDigits(numberN);
 	}
}
