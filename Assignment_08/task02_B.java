import java.util.Scanner;

public class task02_B{
  
  // Task 02_A
  public static double circleArea(int radiusOfCircle){
    
    double circleArea = 3.14159 * radiusOfCircle * radiusOfCircle;
    
    return circleArea;
  }
  
  // Task 02_B
  public static double sphereVolume(int radiusOfCircle){
    double sphereVolume = (4.0/3) * 3.14159 * radiusOfCircle * radiusOfCircle * radiusOfCircle;
    
    return sphereVolume;
  }
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter radius of the circle: ");
    int radiusOfCircle = sc.nextInt();
    
    circleArea(radiusOfCircle);
    sphereVolume(radiusOfCircle);
    
    System.out.println("Area is : " + circleArea(radiusOfCircle));
    System.out.println("Volume is : " + sphereVolume(radiusOfCircle));
    
  }
}
