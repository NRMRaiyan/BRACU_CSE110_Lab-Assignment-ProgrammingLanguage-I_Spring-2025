import java.util.Scanner;

public class task04{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter length of array: ");
    int arraySize = sc.nextInt();
    
    int [] array = new int [arraySize];
    
    for(int i = 0; i < arraySize; i++){
      System.out.print("Enter element: ");
      int element = sc.nextInt();
      array[i] = element;
    }
    
    System.out.println("Original array:");
    
    for(int i = 0; i < arraySize; i++){
      System.out.print(array[i] + " ");
    }
    
    System.out.println();
    
    System.out.println("After modifying: ");
    
    for(int i = 0; i < arraySize; i++){
      if(array[i] > 0){
        array[i] = 1;
      }else{
        array[i] = 0;
      }
      System.out.print(array[i] + " ");
    }
    
  }
}