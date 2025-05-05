import java.util.Scanner;
public class task02{
  public static void main (String [] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter your score: ");
    int score = sc.nextInt();
    
    if(score >= 90 && score <= 100){
      System.out.println("Your grade is A");
    }else if(score >= 85 && score <= 89){
      System.out.println("Your grade is A-");
    }else if(score >= 70 && score <= 84){
      System.out.println("Your grade is B");
    }else if(score >= 57 && score <= 69){
      System.out.println("Your grade is C");
    }else if(score >= 50 && score <= 56){
      System.out.println("Your grade is D");
    }else if(score <= 49){
      System.out.println("Your grade is F");
    }else{
      System.out.println("Wrong input!");
    }
  }
}
