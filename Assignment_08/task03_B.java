import java.util.Scanner;

public class main{
  
  // Task 03_A
  public static boolean isTriangle(int side1, int side2, int side3){
    
    return (side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2);
    
  }
  
  // Task 03_B
  public static double squareRoot(double squaredArea){
    double number = squaredArea / 2.0;
    double lowest = 0.00001;

    while ((number * number - squaredArea) > lowest || (squaredArea - number * number) > lowest) {
        number = (number + squaredArea / number) / 2.0;
    }

    return number;
}
  
  public static void triArea(int side1, int side2, int side3){
    
    double semiPerimeterOfTriangle = (side1 + side2 + side3) / 2;
    
    double squaredArea = semiPerimeterOfTriangle * (semiPerimeterOfTriangle - side1) * (semiPerimeterOfTriangle - side2) * (semiPerimeterOfTriangle - side3);
      
    double areaOfTriangle = 0;
    
    if(isTriangle(side1, side2, side3) == true){
      
      areaOfTriangle = squareRoot(squaredArea);
      
      System.out.printf("The area of the triangle is : %.3f", areaOfTriangle);
    }else{
      System.out.println("Can't form triangle");
    }
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
    
    triArea(side1, side2, side3);
  }
}
