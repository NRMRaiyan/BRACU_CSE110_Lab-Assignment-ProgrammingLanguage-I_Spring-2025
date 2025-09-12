import java.util.Scanner;
public class main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter your Student ID : ");
    int student_id = sc.nextInt();
    
    int lastDigit = student_id % 10;
    int secondLastDigit = (student_id / 10) % 10;
    
    System.out.println("The rightmost 2 digits of the Student ID in reverse is = " + lastDigit + "" + secondLastDigit);
  }
}
