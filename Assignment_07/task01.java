import java.util.Scanner;

public class task01{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter size of array : ");
    int arraySize = sc.nextInt();
    
    int [] newArray = new int [arraySize];
    
    for(int i = 0; i < arraySize; i++){
      System.out.print("Enter a number: ");
      int element = sc.nextInt();
      newArray[i] = element;
    }
    
    for(int i = 0; i < arraySize; i++){
      System.out.println(i + ": " + newArray[i]);
    }
    
    System.out.print("Enter another number: ");
    int newElement = sc.nextInt();
    
    int [] resizedArray = new int [arraySize + 1];
    
    for(int i = 0; i < arraySize; i++){
      resizedArray[i] = newArray[i];
    }
    
    resizedArray[arraySize] = newElement;
    
    int resizedArraySize = resizedArray.length;
    
    for(int i = 0; i < resizedArraySize; i++){
      System.out.print(resizedArray[i] + " ");
    }
  }
}
