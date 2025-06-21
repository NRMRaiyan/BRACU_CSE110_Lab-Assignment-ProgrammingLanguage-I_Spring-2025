import java.util.Scanner;

public class task07
{
  // Task 07
  public static void print_elements(int [] array, int index)
{
    int arraySize = array.length;
    
    if(index >= arraySize) return;
    
    System.out.println(array[index]);
    
    print_elements(array, index + 1);
  }
  
 	 public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter array size : ");

    int arraySize = sc.nextInt();
    
    int [] array = new int [arraySize];
    
    for(int i = 0; i < arraySize; i++){

      System.out.print("Enter elements : ");

      int element = sc.nextInt();

      array[i] = element;
    }
    
    System.out.println("Enter index : ");

    int index = sc.nextInt();
    
    print_elements(array, index);
  }
}
