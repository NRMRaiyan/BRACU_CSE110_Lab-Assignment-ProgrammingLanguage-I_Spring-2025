import java.util.Scanner;

public class task05
{
  public static void main(String[] args)
    {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter array size:");


    int arraySize = sc.nextInt();
    
    int [] array = new int [arraySize];
    

    for(int i = 0; i < arraySize; i++)
    {

      System.out.print("Enter a number: ");
      int element = sc.nextInt();
      array[i] = element;

    }
    
    System.out.print("Enter element to find : ");
    int findElement = sc.nextInt();
    
    boolean foundElement = false;
    
    for(int i = 0; i < arraySize; i++)
    {
      if(array[i] == findElement)
        {

        System.out.println(array[i] + " is at index " + i);
        foundElement = true;
        break;

      }
    }
    
    if(foundElement == false)
    {
      System.out.println("Element not found");
    }

  }
}