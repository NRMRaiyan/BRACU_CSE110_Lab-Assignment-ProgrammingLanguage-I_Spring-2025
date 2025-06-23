import java.util.Scanner;
public class task10{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter number of rows: ");
    int row = sc.nextInt();
    
    for(int i = 1; i <= row; i++){
      for(int s = 1; s <= row - i; s++){
        System.out.print(" ");
      }
      for(int j = 1; j <= 2 * i - 1; j++){
        if(i == row){
          System.out.print(j);
        }else{
          if(j == 1 || j == 2 * i - 1){
            System.out.print(j);
          }else{
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }
}
