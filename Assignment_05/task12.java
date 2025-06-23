import java.util.Scanner;
public class task12{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter number: ");
    int number = sc.nextInt();
    
    for(int i = 1; i<= number; i++){
     System.out.print(i);
    }
    for(int j = number - 1; j >= 1; j--){
      System.out.print(j);
    }
  }
}
