import java.util.Scanner;
public class task01{
  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter N: ");
    int N = sc.nextInt();
    
    for(int i = 1; i <= N; i++){
     System.out.print(i); 
    }
  }
}
