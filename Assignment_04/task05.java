import java.util.Scanner;
public class task05 {
  public static void main(String [] args){
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Enter length of rectangle: ");
    int length = sc.nextInt();
    System.out.println("Enter width of rectangle: ");
    int width = sc.nextInt();
    
    for(int i = 1; i <= width; i++){
      for(int j = 1; j <= length; j++){
        System.out.print(j + " ");
      }
      System.out.println();
      System.out.println();
    }
    
  }
}
