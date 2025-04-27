import java.util.Scanner;

public class task03_B{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the length of the array : ");
    int arraySize = sc.nextInt();
    
    int [] array = new int [arraySize];
    
    for(int i = 0; i < arraySize; i++){
      System.out.print("Enter a number: ");
      int element = sc.nextInt();
      array[i] = element;
    }
    
    System.out.println("Reversed the original array:");
    
    for(int i = arraySize - 1; i >= 0; i--){
      System.out.print(array[i] + " ");
    }
  }
}