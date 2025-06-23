import java.util.Scanner;
public class task09{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter number: ");
    int row = sc.nextInt();
    
    for(int i = 1; i <= row; i++){
      for(int s = 1; s <= row - i; s++){
        System.out.print(" ");
      }
      if(i == row){
        for (int j = 1; j <= row; j++){
          System.out.print(j);
        }
      }else if(i == 1){
        System.out.print(row);
      }else{
        System.out.print(row - i + 1);
        for(int space = 1; space <= i - 2; space++){
          System.out.print(" ");
        }
        System.out.print(row);
      }
      System.out.println();
    }
  }
}
