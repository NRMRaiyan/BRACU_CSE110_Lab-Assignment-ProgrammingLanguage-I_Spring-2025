import java.util.Scanner;
public class task01{
  public static void main(String [] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter first digit: ");
    int firstDigit = sc.nextInt();
    System.out.println("Enter last digit: ");
    int lastDigit = sc.nextInt();
    
    for(int i = firstDigit; i >= lastDigit; i = i - 6){
      if(i != lastDigit) System.out.print(i + ", ");
      else System.out.print(i + "");
    }
  }
}
