import java.util.Scanner;

public class task10
{
  public static void main(String[] args)
    {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter number of students: ");

    int numberOfStudents = sc.nextInt();
    int [] marksOfStudents = new int [numberOfStudents];
    String [] namesOfStudents = new String [numberOfStudents];
    
    System.out.println("Marks of Students: ");

    for(int i = 0; i < numberOfStudents; i++)
    {
      System.out.print("Enter marks: ");
      int element = sc.nextInt();
      marksOfStudents[i] = element;
    }
    
    System.out.println();
    
    System.out.println("Names of Students: ");

    for(int i = 0; i < numberOfStudents; i++)
    {
      System.out.print("Enter names: ");
      String element = sc.next();
      namesOfStudents[i] = element;
    }
    
    for(int i = 0; i < numberOfStudents - 1; i++)
    {
      for(int j = 0; j < numberOfStudents - 1 - i; j++)
        {
        if(marksOfStudents[j] > marksOfStudents[j + 1])
        {
          int tempMarks = marksOfStudents[j];

          marksOfStudents[j] = marksOfStudents[j + 1];
          marksOfStudents[j + 1] = tempMarks;
          
          String tempNames = namesOfStudents[j];
          namesOfStudents[j] = namesOfStudents[j + 1];
          namesOfStudents[j + 1] = tempNames;
        }
      }
    }
    
    System.out.println("Sorted Array: ");
    
    for(int i = 0; i < numberOfStudents; i++)
    {
      System.out.print(marksOfStudents[i] + " ");
    }
    
    System.out.println();
    
    for(int i = 0; i < numberOfStudents; i++)
    {
      System.out.print(namesOfStudents[i] + " ");
    }
  }
}
