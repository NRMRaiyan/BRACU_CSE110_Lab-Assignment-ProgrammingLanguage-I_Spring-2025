import java.util.Scanner;
public class task03{
  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter row: ");
    int row = sc.nextInt();
    
    for(int i = 1; i <= row; i++){
      for(int j = 1; j <= i; j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}