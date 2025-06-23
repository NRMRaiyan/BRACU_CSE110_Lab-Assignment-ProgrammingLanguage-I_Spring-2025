import java.util.Scanner;
public class task04 {
  public static void main(String [] args){
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Enter number of test cases: ");
    int testCases = sc.nextInt();
    
    for(int i = 1; i <= testCases; i++){
      
    System.out.println("Enter X: ");
    int valueX = sc.nextInt();
    System.out.println("Enter Y: ");
    int valueY = sc.nextInt();
    
    int sum = 0;
    int count = 0;
    int current = valueX;
    
    if(current % 2 == 0){
      current++;
    }
    
    
    while(count < valueY){
     sum += current;
     current += 2;
     count++;
    }
    System.out.println(sum);
    }
  }
}
