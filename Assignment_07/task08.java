import java.util.Scanner;

public class task08{
  public static void main(String[] args){
    
   	 Scanner sc = new Scanner(System.in);
    
    System.out.print("Please enter the length of array 1: ");
    	int array1Size = sc.nextInt();
    
    int [] array1 = new int [array1Size];
    
    	for(int i = 0; i < array1Size; i++){
     	 	System.out.print("Enter element: ");
     	 int elementArray1 = sc.nextInt();
     		 array1[i] = elementArray1;
    	}
    
    System.out.print("Please enter the length of array 2: ");

    	int array2Size = sc.nextInt();
    
    int [] array2 = new int [array2Size];
    
    for(int i = 0; i < array2Size; i++){
     	 System.out.print("Enter element: ");
      int elementArray2 = sc.nextInt();
     	 array2[i] = elementArray2;
    }
    
    int subsetCounter = 0;
    
    for(int i = 0; i < array2Size; i++){
      for(int j = 0; j < array1Size; j++){
       	 if(array2[i] == array1[j]){
          subsetCounter++;
          	break;
        }
      }
    }
    if(subsetCounter == array2Size){
      System.out.println("Array 2 is a subset pf Array 1.");
    }else{
      System.out.println("Array 2 is not a subset pf Array 1.");
    }
  }
}
