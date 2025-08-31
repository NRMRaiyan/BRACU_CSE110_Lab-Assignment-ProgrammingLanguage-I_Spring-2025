import java.util.Scanner;

public class task02_C{
  
  // Task 02_A
  public static double circleArea(double radiusOfCircle){
    
    double circleArea = 3.14159 * radiusOfCircle * radiusOfCircle;
    
    return circleArea;
  }
  
  // Task 02_B
  public static double sphereVolume(double radiusOfCircle){
    double sphereVolume = (4.0/3) * 3.14159 * radiusOfCircle * radiusOfCircle * radiusOfCircle;
    
    return sphereVolume;
  }
  
  //Task 02_C
  public static void findSpace(int diameterOfFigure, String shape){
    
    double radiusOfCircle = diameterOfFigure / 2.0;
    
    if(shape.equalsIgnoreCase("circle"))
    {
      double area = circleArea(radiusOfCircle);
      System.out.printf("%.4f\n", area);
    }
    else if(shape.equalsIgnoreCase("sphere"))
    {
      double volume = sphereVolume(radiusOfCircle);
      System.out.printf("%.4f\n", volume);
    }
    else{
      System.out.println("Wrong Parameter");
    }
  }
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter radius of the circle: ");
    int radiusOfCircle = sc.nextInt();
    
    System.out.println("Enter diameter of the figure: ");
    int diameterOfFigure = sc.nextInt();
    
    sc.nextLine();
    
    System.out.println("Enter name of the figure: ");
    String shape = sc.nextLine();
    
    circleArea(radiusOfCircle);
    sphereVolume(radiusOfCircle);
    findSpace(diameterOfFigure, shape);
    
//    System.out.println("Area is : " + circleArea(radiusOfCircle));
//    System.out.println("Volume is : " + sphereVolume(radiusOfCircle));
    
  }
}
