import java. util.Scanner;

public class task06_A{
  
  // Task 06_A
  public static double calcTax(int age, int salary){
    double tax = 0.0;
    if(age < 18 || salary < 10000){
      System.out.println(0.0);
    }
    else if(salary >= 10000 && salary <= 20000){
      tax = salary * (7.0 / 100);
      //System.out.printf("%.1f", tax);
    }else{
      tax = salary * (14.0 / 100);
      //System.out.printf("%.1f", tax);
    }
    return tax;
  }
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter your age : ");
    int age = sc.nextInt();
    
    System.out.println("Enter your salary: ");
    int salary = sc.nextInt();
    
    double tax = calcTax(age, salary);
    
    System.out.printf("%.1f", tax);
  }
}
