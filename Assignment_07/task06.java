import java.util.Scanner;

public class task06{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    	System.out.println("Enter the length of the array: ");
    int arraySize = sc.nextInt();
    
    	double [] array = new double [arraySize];
    
    for(int i = 0; i < arraySize; i++){
      	System.out.print("Enter a number: ");
      double element = sc.nextDouble();
      	array[i] = element;
    }
    
  	  double maximumElement = array[0];
   	 	double minimumElement = array[0];

    	int maximumElementIndex = 0;
   		int minimumElementIndex = 0;
      
    for(int i = 0; i < arraySize; i++){
      
      if(array[i] > maximumElement){
        maximumElement = array[i];
        	maximumElementIndex = i;
        continue;
      }
    }
    
    for(int i = 0; i < arraySize; i++){
      
      if(array[i] < minimumElement){
        minimumElement = array[i];
        	minimumElementIndex = i;
        continue;
      }
    }

   	System.out.println("Maximum element " + maximumElement + " found at index " + maximumElementIndex);
    System.out.println("Miniimum element " + minimumElement + " found at index " + minimumElementIndex);
    
    double summationOfAllElements = 0;
    
    for(int i = 0; i < arraySize; i++){
      summationOfAllElements += array[i];
    }
    
   	System.out.println("Summation: " + summationOfAllElements);
   	System.out.printf("Average: %.2f", summationOfAllElements / arraySize);
  }
}
