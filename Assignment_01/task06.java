import java.util.Scanner;
public class main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter minutes : ");
    int minutes = sc.nextInt();
    
    int years = minutes / 525600;
    int days = (minutes % 525600) / 1440;
    
    System.out.println(minutes + " minuites is approximately " + years + " years and " + days + " days.");
  }
}
