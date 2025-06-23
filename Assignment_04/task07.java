import java.util.Scanner;
public class task07{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    
    int number = 1;
    
    while(number > 0){
      System.out.println("Enter Number: ");
      number = sc.nextInt();
      
      if(number < 0){
        break;
      }else{
        System.out.println(number + " ^ 2 = " + number * number);
      }
      
    }
  }
}
