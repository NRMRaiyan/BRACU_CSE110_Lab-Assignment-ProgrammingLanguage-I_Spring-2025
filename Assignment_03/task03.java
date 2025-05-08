import java.util.Scanner;
public class task03{
  public static void main(String [] args){
     
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter number that will be added upto: ");
    int number = sc.nextInt();
    
    int sum = 0;
    for(int i = 1; i <= number; i++){
      if(i % 7 == 0 && i % 9 == 0){
        sum = sum + i;
      }
    }
    System.out.println("The sum: " + sum);
  }
}
