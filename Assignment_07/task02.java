import java.util.Scanner;

public class task02{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter size for your array : ");
    int arraySize = sc.nextInt();
    
    int [] array = new int [arraySize];
    
    for(int i = 0; i < arraySize; i++){
      System.out.print("Enter element: ");
      int element = sc.nextInt();
      array[i] = element;
    }

    System.out.println("Before removing duplicates: ");
    
    for(int i = 0; i < arraySize; i++){
      System.out.print(array[i] + " ");
    }
    
    for(int i = 0; i < arraySize; i++){
      for(int j = i + 1; j < arraySize; j++){
        if(array[i] == array[j]){
          array[j] = 0;
          continue;
        }
      }
    }
    
    System.out.println();
    
    System.out.println("After replacing duplicates with 0: ");
    
    for(int i = 0; i < arraySize; i++){
      System.out.print(array[i] + " ");
    }
  }
}