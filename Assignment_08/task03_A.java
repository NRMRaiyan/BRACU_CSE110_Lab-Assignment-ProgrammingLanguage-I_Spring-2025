import java.util.Scanner;

public class task03_A{
  
  // Task 03_A
  public static boolean isTriangle(int side1, int side2, int side3){

    return (side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2);
    
  }
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter length of side 1 : ");
    int side1 = sc.nextInt();
    
    System.out.println("Enter length of side 2 : ");
    int side2 = sc.nextInt();
    
    System.out.println("Enter length of side 3 : ");
    int side3 = sc.nextInt();
    
    boolean answer = isTriangle(side1, side2, side3);
    
    System.out.println(answer);
  }
}
