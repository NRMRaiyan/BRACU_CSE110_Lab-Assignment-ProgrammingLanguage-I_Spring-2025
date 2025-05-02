import java.util.Scanner;
public class task02 {
  public static void main(String [] args){
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Enter the number: ");
    int number = sc.nextInt();
    
    int valueY = 0;
    
    for(int i = 1; i<= number; i++){
      valueY -= (i * (i + 1)) / 2;
    }
    System.out.println("The value of y: " + valueY);
  }
}