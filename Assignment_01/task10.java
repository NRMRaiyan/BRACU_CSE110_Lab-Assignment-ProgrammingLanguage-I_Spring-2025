import java.util.Scanner;
public class main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    float a = 4.5f;
    float b = 9.5f;
    
    double c = Math.sqrt(a * a + b * b);
    
    double sinA = a / c;
    double cosA = b / c;
    double sinB = b / c;
    double cosB = a / c;
    
    System.out.printf("sinA = %.3f\n", sinA);
    System.out.printf("cosA = %.3f\n", cosA);
    System.out.printf("sinB = %.3f\n", sinB);
    System.out.printf("cosB = %.3f\n", cosB);
  }
}
