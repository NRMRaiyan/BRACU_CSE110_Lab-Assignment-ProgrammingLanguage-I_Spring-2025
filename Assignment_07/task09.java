import java.util.Scanner;

public class task09{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter size of array: ");

    	int arraySize = sc.nextInt();
    
    int [] array = new int [arraySize];
    
    for(int i = 0; i < arraySize; i++){
      	System.out.print("Enter element of array: ");
      int element = sc.nextInt();
      	array[i] = element;
    }
    
    System.out.println("Original Array: ");
    
    for(int i = 0; i < arraySize; i++){
      System.out.print(array[i] + " ");
    }
    
    System.out.println();
    
    for(int i = 0; i < arraySize - 1; i++){
      int maxElementIndex = i;

      for(int j = i + 1; j < arraySize; j++){
        if(array[j] > array[maxElementIndex]){
          maxElementIndex = j;
        }
      }
      
      if(maxElementIndex != i){
        int temp = array[i];

        array[i] = array[maxElementIndex];

        array[maxElementIndex] = temp;
      }
    }
    
    System.out.println("Sorted Array: ");
    
    for(int i = 0; i < arraySize; i++){
      System.out.print(array[i] + " ");
    }
  }
}
