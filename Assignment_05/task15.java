import java.util.Scanner;

public class task15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter row: ");
    int row = sc.nextInt();
    int mid = (row + 1) / 2;
    
    for (int i = 0; i < mid; i++) {
      for (int s = 0; s < i; s++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= row - 2 * i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
    
    for (int i = mid - 2; i >= 0; i--) {
      for (int s = 0; s < i; s++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= row - 2 * i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
