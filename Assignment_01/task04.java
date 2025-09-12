import java.util.Scanner;
public class main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter number : ");
    int number = sc.nextInt();
                       
    int lastTwoDigits = number % 100;
    
    System.out.println("Last two digits of " + number + " is : " + lastTwoDigits);
  }
}
