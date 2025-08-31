import java.util.Scanner;

public class task02_A
{
  
  // Task 02_A
  public static double circleArea(int radiusOfCircle){
    
    double circleArea = 3.14159 * radiusOfCircle * radiusOfCircle;
    
    return circleArea;
  }
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter radius of the circle: ");
    int radiusOfCircle = sc.nextInt();
    
    circleArea(radiusOfCircle);
    
    System.out.println("Area is : " + circleArea(radiusOfCircle));
    
  }
}
