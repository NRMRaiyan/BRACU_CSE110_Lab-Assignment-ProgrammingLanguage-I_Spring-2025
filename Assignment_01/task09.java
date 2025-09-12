public class main {
  public static void main(String[] args) {
    
    int a = 8;
    int b = 3;

    // Side length of the hexagon (from the visualization, a = 8)
    int perpendicular = a / 2;
    double sideLength = Math.sqrt((perpendicular * perpendicular) + (b * b));
        
    // Calculate the area: Area of hexagon = (3√3/2) * s²
    double area = (3 * Math.sqrt(3) / 2) * sideLength * sideLength;
        
    // Calculate the circumference: Circumference of hexagon = 6 * s
    double circumference = 6 * sideLength;
        
    System.out.printf("The area of the hexagon is : %.3f square units%n", area);
    System.out.printf("The circumference of the hexagon is: %.3f units%n", circumference);
  }
}
