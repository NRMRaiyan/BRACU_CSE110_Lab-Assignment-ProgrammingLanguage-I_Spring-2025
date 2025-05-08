import java.util.Scanner;

public class task02{
  public static void main(String [] args){
     
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter input for numbers(N): ");
    int numberN = sc.nextInt();
    
    System.out.println("Input the " + numberN + " numbers:");
    
    int sum = 0;
    float average = 0;
    for(int i = 1; i <= numberN; i++){
      int numbers = sc.nextInt();
      sum = sum + i;
      average = sum / numberN;
    }
    System.out.println("The sum of " + numberN + " no is: " + sum);
    System.out.println("The average is: " + average);
  }
}
