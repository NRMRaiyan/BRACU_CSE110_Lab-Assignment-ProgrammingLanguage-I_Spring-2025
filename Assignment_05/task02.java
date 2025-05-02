import java.util.Scanner;
public class task02{
  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter row: ");
    int row = sc.nextInt();
    System.out.println("Enter column: ");
    int column = sc.nextInt();
    
    for(int i = 1; i <= row; i++){
      for(int j = 1; j <= column; j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}