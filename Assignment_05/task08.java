import java.util.Scanner;
public class task08{
  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter row: ");
    int row = sc.nextInt();
    
    for(int i = 1; i <= row; i++){
      for(int j = 1; j <= i; j++){
        if(i > 2 && i < row){
          if(j > 1 && j < i){
            System.out.print(" ");
          }
          else{
            System.out.print(j);
          }
        }
        else{
          System.out.print(j);
        }
      }
      System.out.println();
    }
  }
}
