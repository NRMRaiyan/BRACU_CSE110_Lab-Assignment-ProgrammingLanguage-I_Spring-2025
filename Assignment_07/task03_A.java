import java.util.Scanner;

public class task03_A{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter array size: ");
    int arraySize = sc.nextInt();
    
    int [] array = new int [arraySize];
    
    for(int i = 0; i < arraySize; i++){
      System.out.print("Enter a number: ");
      int element = sc.nextInt();
      array[i] = element;
    }
    
    int [] newArray = new int [arraySize];
    
    for(int i = 0; i < arraySize; i++){
      newArray[arraySize - i - 1] = array[i];
    }
    
    System.out.println("Reversed using a new array: ");
    
    for(int i = 0; i < arraySize; i++){
      System.out.print(newArray[i] + " ");
    }
  }
}