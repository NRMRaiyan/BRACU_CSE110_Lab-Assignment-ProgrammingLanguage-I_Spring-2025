import java.util.Scanner;
public class task01_B{
  public static void main(String [] args){
     
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter first digit: ");
    int firstDigit = sc.nextInt();
    System.out.println("Enter last digit: ");
    int lastDigit = sc.nextInt();
    
    for(int i = firstDigit; i <= lastDigit; i = i + 9){
      if(i % 2 != 0){
        System.out.print(i * -1);
      }else{
        System.out.print(i);
      }
      if(i != lastDigit) System.out.print(", ");
      else System.out.print("");
    }
  }
}
