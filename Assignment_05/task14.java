import java.util.Scanner;
public class task14{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter row: ");
    int row = sc.nextInt();
    
    for(int i = row; i >= 1; i--){
      for(int s = 1; s <= row - i; s++){
        System.out.print(" ");
      }
      for(int j = 1; j <= i; j++){
        System.out.print(j);
      }
      for(int k = i - 1; k >= 1; k--){
        System.out.print(k);
      }
      System.out.println();
    }
  }
}
